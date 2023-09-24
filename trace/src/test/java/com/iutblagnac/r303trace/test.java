public class AppTest
        extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Test the return with empty parameter
     */
    public void testHelloEmptyParameter()
    {
        assertEquals("Hello World!", App.hello());
    }

    /**
     * Test the return with a parameter
     */
    public void testHelloParameter()
    {
        assertEquals("Hello JMB!", App.hello("Hello JMB!"));
    }
}