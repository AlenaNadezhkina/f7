import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetStation(){
        Radio rd = new Radio();
        rd.setCurrentStation(0);
        int expected = 7;
        int actual = rd.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudNextStation(){
        Radio rd = new Radio();
        rd.next(0);
        int expected = 9;
        int actual = rd.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoudPrevStation(){
        Radio rd = new Radio();
        rd.prev(8);
        int expected = 7;
        int actual = rd.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolume(){
        Radio rd = new Radio();
        rd.setCurrentVolume(99);
        int expected = 99;
        int actual = rd.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxVolume(){
        Radio rd = new Radio();
        rd.maxVolume(33);
        int expected = 34;
        int actual = rd.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldMinVolume(){
        Radio rd = new Radio();
        rd.minVolume(-2);
        int expected = 0;
        int actual = rd.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }
}
