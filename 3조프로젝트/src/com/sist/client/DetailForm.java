package com.sist.client;

import javax.swing.*;
import java.net.*; // url

import com.sist.data.MovieManager;
import com.sist.data.MovieVO;

import java.awt.*;

public class DetailForm extends JPanel{
	JLabel poster=new JLabel();
	JLabel la1 = new JLabel("",JLabel.CENTER);
	JLabel[] la = new JLabel[7];
	JTextPane ta = new JTextPane();
	JButton b1,b2; // 예매하기, 목록으로 돌아가기
	
	public DetailForm() {
		setLayout(null);
		poster.setBounds(10,15,350,400);
		add(poster);
		
		la1.setBounds(365,15,500,45);
		// la1.setOpaque(false);
		// la1.setBackground(Color.BLUE);
		la1.setFont(new Font("고딕체", Font.BOLD, 40));
		add(la1);
		
		JPanel p =new JPanel();
		p.setLayout(new GridLayout(7,1,5,5));
		String[] str = {"감독","출연","장르","등급","개봉일","평점","누적관객수"};
		for(int i=0;i<7;i++)
		{			
			la[i]=new JLabel(str[i]);
			la[i].setFont(new Font("고딕체",Font.BOLD,25));
			p.add(la[i]);
		}
		p.setBounds(365,80,500,300);
		add(p);
		
		ta.setEditable(false);
		JScrollPane js = new JScrollPane(ta);
		js.setBounds(10,470,855,150);
		add(js);
		
		b1=new JButton("예매하기");
		b2=new JButton("목록으로");
		b1.setBackground(Color.red);
		JPanel p2= new JPanel();
		p2.add(b1);
		p2.add(b2);
		p2.setBounds(365,385,200,35);
		add(p2);
		
	}
	public void detailPrint(int mno)
	{
		MovieManager m = new MovieManager();
		MovieVO vo=m.movieDetailData(mno);
		la1.setText(vo.getTitle());
		
		// 포스터 url가져오기?
		try {
			URL url=new URL(vo.getPoster());
			Image img = ClientMainFrame.getImage(new ImageIcon(url), poster.getWidth(),poster.getHeight());
			poster.setIcon(new ImageIcon(img));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		la[0].setText("감독:"+vo.getDirector());
		la[1].setText("출연:"+vo.getActor());
		la[2].setText("장르:"+vo.getGenre());
		la[3].setText("등급:"+vo.getGrade());
		la[4].setText("개봉:"+vo.getRegdate());
		la[5].setText("평점:"+vo.getScore());
		la[6].setText("누적:"+vo.getShowUser());
		ta.setText(vo.getStory());
	}

}
