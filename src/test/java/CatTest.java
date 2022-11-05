import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

@Before
public void init (){
    MockitoAnnotations.initMocks(this);
}
    @Mock
     Feline feline;

    @Test
    public void getSoundReturnValidValue(){
        Cat cat = new Cat(feline);
        String expectedSound = "Мяу";
        String actualSound = cat.getSound();
        Assert.assertEquals("Cat sound is incorrect",expectedSound,actualSound);
    }

    @Test
    public void getFoodReturnValidValue() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals("Cat food is incorrect",cat.getFood(),feline.eatMeat());
    }
}
