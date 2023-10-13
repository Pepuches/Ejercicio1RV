package com.example.a1pantalla.data

fun getProducts() : List<Product>{
    return listOf(
        Product(
            id = 10001,
            name = "Play Station",
            imageURL = "https://img.olx.com.br/thumbs256x256/84/842343680115187.jpg",
            price = 20000f,
            description = "PlayStation 5 es la quinta consola de videojuegos de sobremesa desarrollada por la empresa Sony Interactive Entertainment,"
        ),

        Product(
            id = 10002,
            name = "Xbox Series X",
            imageURL = "https://sm.ign.com/t/ign_es/cover/x/xbox-serie/xbox-series-x_31u9.128.jpg",
            price = 20000f,
            description = "La Xbox Series X ofrece velocidades de cuadro sensacionalmente suaves de hasta 120 FPS "
        ),

        Product(
            id = 10003,
            name = "El gato Wave",
            imageURL = "https://www.infinit.com.uy/imgs/productos/productos31_13502.jpg",
            price = 20000f,
            description = "Un micrófono muy estético que nos aporta una muy buena calidad de sonido."
        ),

        Product(
            id = 10004,
            name = "Stream Deck",
            imageURL = "https://www.infinit.com.uy/imgs/productos/productos31_25346.jpg",
            price = 20000f,
            description = "Stream Deck es un aparatito con el cual puedes con sólo un toque abrir aplicaciones, empezar un directo"
        ),

        Product(
            id = 10005,
            name = "Corsair T3",
            imageURL = "https://www.pccompu.com.uy/imgs/productos/productos31_48249.jpg",
            price = 2034f,
            description = "La silla gamer Corsair T3 RUSH es un producto diseñado para brindar comodidad y ergonomía durante largas sesiones de juego."
        ),

        Product(
            id = 10006,
            name = "Corsair Void Pro",
            imageURL = "https://www.techpowerup.com/review/corsair-void-pro-rgb-wireless/images/small.png",
            price = 20000f,
            description = "Los auriculares inalámbricos VOID PRO RGB ofrecen una comodidad excepcional "
        ),

        Product(
            id = 10007,
            name = "Pikachu",
            imageURL = "https://sm.ign.com/t/ign_es/cover/x/xbox-serie/xbox-series-x_31u9.128.jpg",
            price = 20000f,
            description = ""
        ),

        Product(
            id = 10008,
            name = "Free Buds Pro",
            imageURL = "https://s.cdnshm.com/catalog/ro/t/508803973/husa-pentru-casti-huawei-freebuds-pro-kwmobile-alb-silicon-53473-02.jpg",
            price = 20000f,
            description = "En la calle, en el colectivo o en la oficina, ten siempre a mano tus audífonos Select Sound "
        ),

        Product(
            id = 10009,
            name = "Teclado Ocelot",
            imageURL = "https://s.cdnshm.com/catalog/mx/t/452581255/teclado-mecanico-gamer-yeyian-spark-2000-rgb-usb-switch-azul.jpg",
            price = 20000f,
            description = "Teclado compacto gamer mecánico con switch azul, cuneta con teclas multimedia, con iluminación estilo RGB"
        )
    )
}