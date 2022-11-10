import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
@RunWith(Parameterized.class)
public class LionTest {
    Feline feline;
   private final boolean hasMane;
    private  String sex;
   public LionTest (String sex, boolean hasMane){
        this.sex=sex;
        this.hasMane= hasMane;
    }
    @Parameterized.Parameters
    public  static Object[][] getLionTest(){
        return new Object[][]{
               {"Самец", true},
                {"Самка", false},
        };
    }
    @Test
    public void getHasMane() throws Exception {
            Lion lion = new Lion(sex, feline);
            Assert.assertEquals(hasMane, lion.doesHaveMane());
          }
 }
