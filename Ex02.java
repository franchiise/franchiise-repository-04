package ex02;

public class Ex02 {

    public static void main(String[] args) {

        float media1 = (8 + 9 + 7)/3;
        float media2 = (4 + 5 + 6)/3;
        
        float soma_medias = media1 + media2;
        float media_media = soma_medias/2;
        
        System.out.printf("primeira media: %.1f \nsegunda media: %.1f \nsoma das medias: %.1f \nmedia das medias: %.1f \n", media1, media2, soma_medias, media_media);
        
    }
    
}
