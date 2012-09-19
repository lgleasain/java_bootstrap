
/**
 * Created with IntelliJ IDEA.
 * User: lgleason
 * Date: 9/18/12
 * Time: 11:56 PM
 * To change this template use File | Settings | File Templates.
 */
class LexerTest extends GroovyTestCase{
    void testTokenizer() {

        def lexer = new Lexer('a bad string')
        assertNull lexer.parse()
    }
}
