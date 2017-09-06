package com.arksine.usbserialex;

import com.arksine.utils.HexData;

import timber.log.Timber;

public class UsbSerialDebugger
{
    public static final String ENCODING = "UTF-8";

    private UsbSerialDebugger()
    {

    }

    public static void printLogGet(byte[] src, boolean verbose)
    {
        if(!verbose)
        {
            Timber.i("Data obtained from write buffer: %s", new String(src));
        }else
        {
            Timber.i("Data obtained from write buffer: %s", new String(src));
            Timber.i("Raw data from write buffer: %s", HexData.hexToString(src));
            Timber.i("Number of bytes obtained from write buffer: %d", src.length);
        }
    }

    public static void printLogPut(byte[] src, boolean verbose)
    {
        if(!verbose)
        {
            Timber.i("Data obtained pushed to write buffer: %s", new String(src));
        }else
        {
            Timber.i("Data obtained pushed to write buffer: %s", new String(src));
            Timber.i("Raw data pushed to write buffer: %s", HexData.hexToString(src));
            Timber.i("Number of bytes pushed from write buffer: %d", src.length);
        }
    }

    public static void printReadLogGet(byte[] src, boolean verbose)
    {
        if(!verbose)
        {
            Timber.i("Data obtained from Read buffer: %s", new String(src));
        }else
        {
            Timber.i("Data obtained from Read buffer: %s", new String(src));
            Timber.i("Raw data from Read buffer: %s", HexData.hexToString(src));
            Timber.i("Number of bytes obtained from Read buffer: %d", src.length);
        }
    }

    public static void printReadLogPut(byte[] src, boolean verbose)
    {
        if(!verbose)
        {
            Timber.i( "Data obtained pushed to read buffer: %s", new String(src));
        }else
        {
            Timber.i("Data obtained pushed to read buffer: %s", new String(src));
            Timber.i("Raw data pushed to read buffer: %s", HexData.hexToString(src));
            Timber.i("Number of bytes pushed from read buffer: %d", src.length);
        }
    }



}
