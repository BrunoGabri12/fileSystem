package src.operators;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class convertElements {


    public byte[] convertDatetoBytes(long data) {
        byte[] Data = new byte[]{
        (byte) ((data >> 56) & 0xff),
        (byte) ((data >> 48) & 0xff),
        (byte) ((data >> 40) & 0xff),
        (byte) ((data >> 32) & 0xff),
        (byte) ((data >> 24) & 0xff),
        (byte) ((data >> 16) & 0xff),
        (byte) ((data >> 8) & 0xff),
        (byte) ((data >> 0) & 0xff),
        };

        return Data;
    }

    public byte[] convertShortToBytes(short value){
        
        byte valueinByte[] = new byte[]{
          (byte)(value & 0xff),
          (byte)((value >> 8) & 0xff)};

          return valueinByte;
    }

    public short convertByteToShort(byte[] value){

        return   (short) (value[0]<<8 | value[1] & 0xFF);
    }

    public String convertByteVectorInString(byte[] string){
        String value = new String(string, StandardCharsets.UTF_8);

        return value;
    }

    
    public byte[] convertStringInBytesVector(String string){
       byte[] bytes = string.getBytes(StandardCharsets.UTF_8);

        return bytes;
    }

}
