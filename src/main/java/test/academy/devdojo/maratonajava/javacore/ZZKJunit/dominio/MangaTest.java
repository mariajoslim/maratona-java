package test.academy.devdojo.maratonajava.javacore.ZZKJunit.dominio;


import academy.devdojo.maratonajava.javacore.ZZKJunit.dominio.Manga;
import org.junit.Test;

class  MangaTest{
    private Manga manga1;
    private Manga manga2;
    @BeforeEach
    public void setUp(){
        manga1= new Manga("As meninas superpoderosas", 26);
        manga1= new Manga("3 espiões demais", 29);
//TODO: Test goes here...
}
@Test
    public void acessors_ReturnData_WhenInitilized(){
        Assertions.assertEquals("As meninas superpoderosas", manga1.name());
        Assertions.assertEquals(26,manga1.episodes());
}
@Test
    public void hashCode_ReturnTrue_WhenObjectsAreTheSame(){
        Assertions.assert.Equals(manga1,manga2);

}

public void hashCode_ReturnTrue_WhenObjectsAreTheSame(){
        Assertions.assertEquals(manga1.hashCode(), manga2.hashCode());
}

    public void constructor_ThrowNullPointerException_WhenNameIsNull(){
        Assertions.assertThrows(NullPointerException.class,()-> new Manga(null,12));
    }

    public void isRecord_ReturnTrue_WhenCalledFromManga(){
        Assertions.assertEquals(Manga.class.isRecord ());
    }



} 
