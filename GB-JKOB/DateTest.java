import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DateTest
{
    public DateTest()
    {
    }

    @Before
    public void setUp()
    {
    }

    @After
    public void tearDown()
    {
    }

    @Test
    public void testTue20181002()
    {
        Date date2 = new Date(2018, 10, 02);
        assertEquals(1, date2.weekDay());
    }

    @Test
    public void test20180101()
    {
        Date date1 = new Date(2018, 1, 1);
    }

    @Test
    public void test20181231()
    {
        Date date1 = new Date(2018, 12, 31);
    }
    
    @Test
    public void testDaynumbers2018()
    {
        Date date1 = new Date(2018, 1, 31);
        Date date2 = new Date(2018, 2, 1);
        Date date3 = new Date(2018, 2, 28);
        Date date4 = new Date(2018, 3, 1);
        Date date5 = new Date(2018, 12, 1);
        Date date6 = new Date(2018, 12, 31);
        assertEquals(31, date1.dayInYear());
        assertEquals(32, date2.dayInYear());
        assertEquals(59, date3.dayInYear());
        assertEquals(60, date4.dayInYear());
        assertEquals(335, date5.dayInYear());
        assertEquals(365, date6.dayInYear());
    }
    
    @Test
    public void testYearEnd()
    {
        for(int i = 1582; i < 2500; i++) {
            Date date1 = new Date(i, 12, 31);
            Date date2 = new Date(i + 1, 1, 1);
            assertEquals(date1.dayNumber() + 1, date2.dayNumber());
        }
    }
    
    @Test
    public void testYearLength()
    {
        for(int i = 1582; i < 2500; i++) {
            Date startDate = new Date(i, 1, 1);
            Date endDate = new Date(i, 12, 31);
            if (startDate.isLeapyear()) {
                assertEquals(365, startDate.daysTill(endDate));
            } else {
                assertEquals(364, startDate.daysTill(endDate));
            }
        }
    }
    
    @Test
    public void testFebMar()
    {
        for(int i = 1582; i < 2500; i++) {
            Date startDate = new Date(i, 2, 28);
            Date endDate = new Date(i, 3, 1);
            if (startDate.isLeapyear()) {
                assertEquals(2, startDate.daysTill(endDate));
            } else {
                assertEquals(1, startDate.daysTill(endDate));
            }
        }
    }
    
    /* 
       8:
       Der er ingen test af hverken forkerte input, alle ugedage eller noget.
       Der kan sagtens testes meget mere, og måske burde der. Specielt ugedage.
    */
}



