package com.udogan;

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBucket){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBucket < 0){
            return -1;
        }
        return (int)Math.ceil((width * height - areaPerBucket * extraBucket)/areaPerBucket);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }
        return (int)Math.ceil(width * height/areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if (area <= 0 || areaPerBucket <= 0){
            return -1;
        }
        return (int)Math.ceil(area/areaPerBucket);
    }
}
