public class PaintCalculator {
public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets){
    if(
                    width           <= 0 ||
                    height          <= 0 ||
                    areaPerBucket   <= 0 ||
                    extraBuckets    <  0
    )               {return -1;}
    double area = width * height;
    double bucketCount =  Math.ceil((area / areaPerBucket) - extraBuckets);
    return (int) bucketCount;
}
public static int getBucketCount (double width, double height, double areaPerBucket){
    if(
                    width           <= 0 ||
                    height          <= 0 ||
                    areaPerBucket   <= 0
    )               {return -1;}
    double area = width * height;
    double bucketCount =  Math.ceil((area / areaPerBucket));
    return (int) bucketCount;
}
    public static int getBucketCount (double area, double areaPerBucket){
        if(
                        area           <= 0 ||
                        areaPerBucket   <= 0
        )               {return -1;}
        double bucketCount =  Math.ceil((area / areaPerBucket));
        return (int) bucketCount;
    }
}
//correct solution!