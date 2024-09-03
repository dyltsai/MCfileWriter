// Source code is decompiled from a .class file using FernFlower decompiler.
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;

public class MyFileWriter {
   public MyFileWriter() {
   }

   public static void main(String[] var0) {
      String var1 = "Hello, my name  is aviv and this is my first repo!";
      String var2 = "example1.txt";
      String var3 = "example2.txt";
      String var4 = "example3.txt";
      String var5 = "example4.txt";
      String var6 = "example5.txt";

      try {
         FileWriter var7 = new FileWriter(var2);

         try {
            var7.write(var1);
         } catch (Throwable var21) {
            try {
               var7.close();
            } catch (Throwable var20) {
               var21.addSuppressed(var20);
            }

            throw var21;
         }

         var7.close();
      } catch (IOException var22) {
         var22.printStackTrace();
      }

      try {
         BufferedWriter var23 = new BufferedWriter(new FileWriter(var3));

         try {
            var23.write(var1);
         } catch (Throwable var18) {
            try {
               var23.close();
            } catch (Throwable var17) {
               var18.addSuppressed(var17);
            }

            throw var18;
         }

         var23.close();
      } catch (IOException var19) {
         var19.printStackTrace();
      }

      try {
         FileOutputStream var24 = new FileOutputStream(var4);

         try {
            var24.write(var1.getBytes());
         } catch (Throwable var15) {
            try {
               var24.close();
            } catch (Throwable var14) {
               var15.addSuppressed(var14);
            }

            throw var15;
         }

         var24.close();
      } catch (IOException var16) {
         var16.printStackTrace();
      }

      try {
         BufferedOutputStream var25 = new BufferedOutputStream(new FileOutputStream(var5));

         try {
            var25.write(var1.getBytes());
         } catch (Throwable var12) {
            try {
               var25.close();
            } catch (Throwable var11) {
               var12.addSuppressed(var11);
            }

            throw var12;
         }

         var25.close();
      } catch (IOException var13) {
         var13.printStackTrace();
      }

      try {
         Files.write(Paths.get(var6), var1.getBytes(StandardCharsets.UTF_8), new OpenOption[0]);
      } catch (IOException var10) {
         var10.printStackTrace();
      }

   }
}
