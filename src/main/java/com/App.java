package com;
import com.aws.AWSKinesisClient;
import com.model.Order;
import com.amazonaws.services.kinesis.AmazonKinesis;
import com.model;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Order order = new Order();
        order.setOrderId(1);
        order.setProduct("TV");
        order.setQuantity(100);

        AmazonKinesis client = AWSKinesisClient.getKinesisClient();
        System.out.println(k);
    }
}
