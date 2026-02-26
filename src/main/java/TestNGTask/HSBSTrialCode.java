package TestNGTask;

import org.junit.Assert;
import org.testng.annotations.Test;

public class HSBSTrialCode {
    @Test
    public void successfulFundTransfer(){
        double senderBalance = 10000;
        double transferAmount = 2500;

        if(senderBalance >= transferAmount){
            senderBalance -= transferAmount;
        }
        Assert.assertEquals(senderBalance,7500);
    }
}
