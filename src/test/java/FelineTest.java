import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)

public class FelineTest {

    @Spy
    private Feline feline;

    @Test
    public void checkEatMeatReturnFoodForPredator () throws Exception {
        List listEat = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(listEat);
        Assert.assertEquals("Еда хищника - Животные, Птицы, Рыба", listEat, feline.eatMeat());
    }

    @Test
    public void getKittensReturnValidValue(){
        Feline feline = new Feline();
        int expectedKittensCount = 1;
        int actualKittensCount = feline.getKittens();
        Assert.assertEquals("Kittens count is incorrect",expectedKittensCount,actualKittensCount);
    }

    @Test
    public void getFamilyReturnValidValue(){
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        Assert.assertEquals("Family is incorrect",expectedFamily,actualFamily);
    }
    }


