package com.objects;

public class patient {
		private int pid;
		private String pname;
		private int p_cont;
		private String p_add;
		private int p_altNo;
		private String p_email;
		private int p_Id_Proof;
		public patient(int pid, String pname, int p_cont, String p_add, int p_altNo, String p_email, int p_Id_Proof) {
			this.pid = pid;
			this.pname = pname;
			this.p_cont = p_cont;
			this.p_add = p_add;
			this.p_altNo = p_altNo;
			this.p_email = p_email;
			this.p_Id_Proof = p_Id_Proof;
		}
		public String getPname() {
			return pname;
		}
		public void setPname(String pname) {
			this.pname = pname;
		}
		public int getP_cont() {
			return p_cont;
		}
		public void setP_cont(int p_cont) {
			this.p_cont = p_cont;
		}
		public String getP_add() {
			return p_add;
		}
		public void setP_add(String p_add) {
			this.p_add = p_add;
		}
		public int getP_altNo() {
			return p_altNo;
		}
		public void setP_altNo(int p_altNo) {
			this.p_altNo = p_altNo;
		}
		public String getP_email() {
			return p_email;
		}
		public void setP_email(String p_email) {
			this.p_email = p_email;
		}
		public int getPid() {
			return pid;
		}
		public int getP_Id_Proof() {
			return p_Id_Proof;
		}
		@Override
		public String toString() {
			return "patient [pid=" + pid + ", pname=" + pname + ", p_cont=" + p_cont + ", p_add=" + p_add + ", p_altNo="
					+ p_altNo + ", p_email=" + p_email + ", p_Id_Proof=" + p_Id_Proof + "]";
		}
		
	}

