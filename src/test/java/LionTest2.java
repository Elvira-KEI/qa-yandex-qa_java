import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest2 {

    private  int kittensCount = 1;
    @Mock
    Feline feline;


    @Test
    public void getFoodTest() throws Exception {
        try{
            Lion lion = new Lion("Самец", feline);
            Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
            Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
        }catch (Exception exception) {
            Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка",
                    exception.getMessage());
        }
    }
    @Test
    public void getKittensTest() throws Exception {
        try{
            Lion lion = new Lion("Самец", feline);
            Mockito.when(feline.getKittens()).thenReturn(kittensCount);
            Assert.assertEquals(1, lion.getKittens());
        }catch (Exception exception) {
            Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка",
                    exception.getMessage());
        }
    }
}
