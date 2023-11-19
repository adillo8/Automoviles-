package dominio;
public class Vehiculoturismo{
        //atributos    
        private String marca;
        private String modelo;
        private int baseprice;
        private int plazas;

        public void getbaseprice(int baseprice){
            this.baseprice=baseprice;
        }

        public Vehiculoturismo(String marca_,String modelo_,int baseprice_,int plazas_){
            this.marca=marca_;
            this.modelo=modelo_;
            this.baseprice=baseprice_;
            this.plazas=plazas_;
            
            baseprice=1000;
            plazas=7;
            
            if (plazas<=5){
                int precio;
                precio=baseprice_;
            }else{
                int subida=plazas-5;
                double precio=baseprice_*0.10;

            }

            public void setMarca(String marca){
                this.marca = marca;
            }
            public void setModelo(String modelo){
                this.modelo = modelo;
            }
            public void setBasePrice(int base_price){
                this.base_price = base_price;
            }
            public String getMarca(){
                return this.marca;
            }
            public String getModelo(){
                return this.modelo;
            }
            public double getBasePrice(){
                return this.base_price;
            }
            public double getPrecio(){
                return this.precio;
            }
        
            public int getPlazas(){
                return this.plazas;
            }




        }


}

 
 
 
 
 
 
 
 
            