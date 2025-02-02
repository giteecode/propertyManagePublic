package com.cl.entity.view;

import com.cl.entity.JiaofeileixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 缴费类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-02-02 16:12:39
 */
@TableName("jiaofeileixing")
public class JiaofeileixingView  extends JiaofeileixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaofeileixingView(){
	}
 
 	public JiaofeileixingView(JiaofeileixingEntity jiaofeileixingEntity){
 	try {
			BeanUtils.copyProperties(this, jiaofeileixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
