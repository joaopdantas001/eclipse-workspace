package moeda;

public class ConversorMoeda extends Moeda {
		
		private String conversaocodigoiso;
		private double conversaoquantidade;
		private String conversaodata;
		
		public String getConversaocodigoiso() {
			return conversaocodigoiso;
		}
		public void setConversaocodigoiso(String conversaocodigoiso) {
			this.conversaocodigoiso = conversaocodigoiso;
		}
		public double getConversaoquantidade() {
			return conversaoquantidade;
		}
		public void setConversaoquantidade(double conversaoquantidade) {
			this.conversaoquantidade = conversaoquantidade;
		}
		public String getConversaodata() {
			return conversaodata;
		}
		public void setConversaodata(String conversaodata) {
			this.conversaodata = conversaodata;
		}
		
}

