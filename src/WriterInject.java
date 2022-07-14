	public class WriterInject {
		IWriter _iwriter;
		public WriterInject(IWriter iwriter) {
			_iwriter=iwriter;
		}
		
		public void print() {
			_iwriter.write();
		}
	}