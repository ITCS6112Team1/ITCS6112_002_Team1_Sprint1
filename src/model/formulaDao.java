package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DB.DBUtil;


public class formulaDao {
			
	public void addFormula(){
				
	}
	
	public void deleteFormula(){
		
	}
	
	public void updateFormula(){
		
	}
	
	public List<Formula> queryFormulaByCatogory() throws Exception{
		String sql = "Select name , display from formula";
		
		Connection conn = DBUtil.getConnection();
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		List<Formula> fm = new ArrayList<Formula>();
		Formula f = null;
		while(rs.next()){
			f = new Formula();
			f.setName(rs.getString("name"));
			f.setDisplay(rs.getString("display"));
			
			fm.add(f);
		}
		
		return fm;
		
	}
	
	public Formula queryFormulaByName(){
		
		return null;
	}
}
