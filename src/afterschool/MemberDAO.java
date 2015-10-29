package afterschool;

import java.sql.Connection;
import java.sql.PreparedStatement;

import afterschool.ConnUtil;

public class MemberDAO {
	public int add(String id, String name, String department, String phone) {
		int rst = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		try{
			conn = ConnUtil.getConnection();
			String sql = "insert into student(id,name,department,phone) values(?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, name);
			ps.setString(3, department);
			ps.setString(4, phone);
			rst = ps.executeUpdate();
		}catch(Exception e){
		e.printStackTrace();
		}finally{
			ConnUtil.close(ps, conn);
		}
		return rst;
	}
		
}

