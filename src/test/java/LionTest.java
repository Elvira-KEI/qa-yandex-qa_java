import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import java.util.List;


@RunWith(Parameterized.class)
public class LionTest {
    Feline feline;
   private final boolean hasMane;
    private  String sex;
    private final int kittensCount;

    public LionTest (String sex, boolean hasMane, int kittensCount){
        this.sex=sex;
        this.hasMane= hasMane;
        this.kittensCount=kittensCount;
    }
    @Parameterized.Parameters
    public  static Object[][] getLionTest(){
        return new Object[][]{
               {"Самец", true, 1},
                {"Самка", false, 1},
                {"Паук", false, 0}
        };
    }


    @Test
    public void getHasMane() throws Exception {
        try{
            Lion lion = new Lion(sex, feline);
            Assert.assertEquals(hasMane, lion.doesHaveMane());
        }catch (Exception exception) {
            Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка",
                    exception.getMessage());
        }
    }

    }
