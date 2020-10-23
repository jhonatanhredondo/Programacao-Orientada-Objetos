package aula3;

import java.util.Scanner;

public class AlbumFotos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int larguraPaginaAlbum = scanner.nextInt();
        int alturaPaginaAlbum = scanner.nextInt();


        int larguraFotoA = scanner.nextInt();
        int alturaFotoA = scanner.nextInt();
        int larguraFotoB = scanner.nextInt();
        int alturaFotoB = scanner.nextInt();


        if(larguraPaginaAlbum >= alturaPaginaAlbum) {
            if(larguraPaginaAlbum >= alturaFotoA + larguraFotoB) {
                if(alturaPaginaAlbum >= larguraFotoA && alturaPaginaAlbum >= alturaFotoB) {
                    System.out.println("S");
                    return;
                }
            } else if(larguraPaginaAlbum >= alturaFotoB + larguraFotoA){
                if(alturaPaginaAlbum >= larguraFotoB && alturaPaginaAlbum >= alturaFotoA) {
                    System.out.println("S");
                    return;
                }
            }else if(larguraPaginaAlbum >= alturaFotoA + alturaFotoB) {
                if(alturaPaginaAlbum >= larguraFotoA && alturaPaginaAlbum >= larguraFotoB) {
                    System.out.println("S");
                    return;
                }
            }else if(larguraPaginaAlbum >= larguraFotoA + larguraFotoB) {
                if(alturaPaginaAlbum >= alturaFotoA && alturaPaginaAlbum >= alturaFotoB) {
                    System.out.println("S");
                    return;
                }
            }
        } else {
            if(alturaPaginaAlbum >= alturaFotoA + larguraFotoB) {
                if(larguraPaginaAlbum >= larguraFotoA && larguraPaginaAlbum >= alturaFotoB) {
                    System.out.println("S");
                    return;
                }
            } else if(alturaPaginaAlbum >= alturaFotoB + larguraFotoA){
                if(larguraPaginaAlbum >= larguraFotoB && larguraPaginaAlbum >= alturaFotoA) {
                    System.out.println("S");
                    return;
                }
            }else if(alturaPaginaAlbum >= alturaFotoA + alturaFotoB) {
                if(larguraPaginaAlbum >= larguraFotoA && larguraPaginaAlbum >= larguraFotoB) {
                    System.out.println("S");
                    return;
                }
            }else if(alturaPaginaAlbum >= larguraFotoA + larguraFotoB) {
                if(larguraPaginaAlbum >= alturaFotoA && larguraPaginaAlbum >= alturaFotoB) {
                    System.out.println("S");
                    return;
                }
            }
        }
        System.out.println("N");
    }
}
