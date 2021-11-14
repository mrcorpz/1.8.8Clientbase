package net.minecraft.util;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.EncodedKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CryptManager {
   private static final Logger field_180198_a = LogManager.getLogger();

   public static SecretKey func_75890_a() {
      try {
         KeyGenerator lvt_0_1_ = KeyGenerator.getInstance("AES");
         lvt_0_1_.init(128);
         return lvt_0_1_.generateKey();
      } catch (NoSuchAlgorithmException var1) {
         throw new Error(var1);
      }
   }

   public static KeyPair func_75891_b() {
      try {
         KeyPairGenerator lvt_0_1_ = KeyPairGenerator.getInstance("RSA");
         lvt_0_1_.initialize(1024);
         return lvt_0_1_.generateKeyPair();
      } catch (NoSuchAlgorithmException var1) {
         var1.printStackTrace();
         field_180198_a.error("Key pair generation failed!");
         return null;
      }
   }

   public static byte[] func_75895_a(String p_75895_0_, PublicKey p_75895_1_, SecretKey p_75895_2_) {
      try {
         return func_75893_a("SHA-1", new byte[][]{p_75895_0_.getBytes("ISO_8859_1"), p_75895_2_.getEncoded(), p_75895_1_.getEncoded()});
      } catch (UnsupportedEncodingException var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static byte[] func_75893_a(String p_75893_0_, byte[]... p_75893_1_) {
      try {
         MessageDigest lvt_2_1_ = MessageDigest.getInstance(p_75893_0_);

         for(byte[] lvt_6_1_ : p_75893_1_) {
            lvt_2_1_.update(lvt_6_1_);
         }

         return lvt_2_1_.digest();
      } catch (NoSuchAlgorithmException var7) {
         var7.printStackTrace();
         return null;
      }
   }

   public static PublicKey func_75896_a(byte[] p_75896_0_) {
      try {
         EncodedKeySpec lvt_1_1_ = new X509EncodedKeySpec(p_75896_0_);
         KeyFactory lvt_2_1_ = KeyFactory.getInstance("RSA");
         return lvt_2_1_.generatePublic(lvt_1_1_);
      } catch (NoSuchAlgorithmException var3) {
         ;
      } catch (InvalidKeySpecException var4) {
         ;
      }

      field_180198_a.error("Public key reconstitute failed!");
      return null;
   }

   public static SecretKey func_75887_a(PrivateKey p_75887_0_, byte[] p_75887_1_) {
      return new SecretKeySpec(func_75889_b(p_75887_0_, p_75887_1_), "AES");
   }

   public static byte[] func_75894_a(Key p_75894_0_, byte[] p_75894_1_) {
      return func_75885_a(1, p_75894_0_, p_75894_1_);
   }

   public static byte[] func_75889_b(Key p_75889_0_, byte[] p_75889_1_) {
      return func_75885_a(2, p_75889_0_, p_75889_1_);
   }

   private static byte[] func_75885_a(int p_75885_0_, Key p_75885_1_, byte[] p_75885_2_) {
      try {
         return func_75886_a(p_75885_0_, p_75885_1_.getAlgorithm(), p_75885_1_).doFinal(p_75885_2_);
      } catch (IllegalBlockSizeException var4) {
         var4.printStackTrace();
      } catch (BadPaddingException var5) {
         var5.printStackTrace();
      }

      field_180198_a.error("Cipher data failed!");
      return null;
   }

   private static Cipher func_75886_a(int p_75886_0_, String p_75886_1_, Key p_75886_2_) {
      try {
         Cipher lvt_3_1_ = Cipher.getInstance(p_75886_1_);
         lvt_3_1_.init(p_75886_0_, p_75886_2_);
         return lvt_3_1_;
      } catch (InvalidKeyException var4) {
         var4.printStackTrace();
      } catch (NoSuchAlgorithmException var5) {
         var5.printStackTrace();
      } catch (NoSuchPaddingException var6) {
         var6.printStackTrace();
      }

      field_180198_a.error("Cipher creation failed!");
      return null;
   }

   public static Cipher func_151229_a(int p_151229_0_, Key p_151229_1_) {
      try {
         Cipher lvt_2_1_ = Cipher.getInstance("AES/CFB8/NoPadding");
         lvt_2_1_.init(p_151229_0_, p_151229_1_, new IvParameterSpec(p_151229_1_.getEncoded()));
         return lvt_2_1_;
      } catch (GeneralSecurityException var3) {
         throw new RuntimeException(var3);
      }
   }
}
