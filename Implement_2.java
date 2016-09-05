import java.awt.event.*;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.FlowLayout;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;


public class Implement_2 extends JPanel{ 
	
	private static JComboBox ingList;
	
	static String selectfood;
	static ArrayList<String> ingredients = new ArrayList<String>();
	
	static int tomato=0;
	static int carrot=0;
	static int chicken=0;
	static int potato=0;
	static int egg=0;
	static int cheese=0;
	static int mushrooms=0;
	static int salt=0;
	static int pepper=0;
	static int oil=0;
	static int oliveoil=0;
	static int butter=0;
	static int onions=0;
	static int mayonaise=0;

	
		public Implement_2() {
			//create box options
			setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
			
			ingredients.add("Tomato");
			ingredients.add("Carrot");
			ingredients.add("Chicken");
			ingredients.add("Potato");
			ingredients.add("Egg");
			ingredients.add("Cheese");
			ingredients.add("Mushrooms");
			ingredients.add("Salt");
			ingredients.add("Pepper");
			ingredients.add("Oil");
			ingredients.add("Olive Oil");
			ingredients.add("Butter");
			ingredients.add("Onions");
			ingredients.add("Mayonaise");
			selectfood = ingredients.get(1);
			String[] ingr = ingredients.toArray(new String[ingredients.size()]);
			JLabel patternLabel1 = new JLabel("Enter a food name or");
	        JLabel patternLabel2 = new JLabel("select one from the list:");

	        //set properties and make editable
	        ingList = new JComboBox (ingr);
	        ingList.setEditable(true);
	        
	        //Create ComboBox
	        JPanel ingPanel = new JPanel();
	        ingPanel.setLayout(new BoxLayout(ingPanel,BoxLayout.PAGE_AXIS));
	        ingPanel.add(patternLabel1);
	        ingPanel.add(patternLabel2);
	        ingList.setAlignmentX(Component.LEFT_ALIGNMENT);
	        ingPanel.add(ingList);
	        
	        ingPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
	        add(ingPanel);
	        add(Box.createRigidArea(new Dimension(0, 10)));
	        setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
	    }
		

	private static void createAndShowGUI() throws URISyntaxException {
		
		// Create and set up the window
		JFrame frame = new JFrame("Fridge Tek.");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        //Background Image
		JLabel background=new JLabel(new ImageIcon("//Users//alpaziz//Downloads//fridge.jpg"));
    	frame.add(background);
    	background.setLayout(new FlowLayout());
        
		frame.setLayout(new FlowLayout(FlowLayout.LEFT));
		frame.setResizable(true);
		frame.setVisible(true);
		
		//Inserting ComboBox into the JFrame
		JComponent newContentPane = new Implement_2();
		newContentPane.setOpaque(true);
		background.add(newContentPane);
		
		//Panels for buttons and Spinner
		JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel1.setPreferredSize(new Dimension(250,30));
		background.add(panel1);
		
		//Status Labels
		final JLabel tomatostatus = new JLabel("Tomato: "+tomato,JLabel.CENTER);
	    tomatostatus.setSize(200,100);
	    frame.add(tomatostatus);
	    final JLabel carrotstatus = new JLabel("Carrots: "+carrot,JLabel.CENTER);
	    carrotstatus.setSize(200,100);
	    frame.add(carrotstatus);
	    final JLabel chickenstatus = new JLabel("Chicken: "+chicken,JLabel.CENTER);
	    chickenstatus.setSize(200,100);
	    frame.add(chickenstatus);
	    final JLabel potatostatus = new JLabel("Potatoes: "+potato,JLabel.CENTER);
	    potatostatus.setSize(200,100);
	    frame.add(potatostatus);
	    final JLabel eggstatus = new JLabel("Eggs: "+egg,JLabel.CENTER);
	    eggstatus.setSize(200,100);
	    frame.add(eggstatus);
	    final JLabel cheesestatus = new JLabel("Cheese: "+cheese,JLabel.CENTER);
	    cheesestatus.setSize(200,100);
	    frame.add(cheesestatus);
	    final JLabel mushroomstatus = new JLabel("Mushrooms: "+mushrooms,JLabel.CENTER);
	    mushroomstatus.setSize(200,100);
	    frame.add(mushroomstatus);
	    final JLabel saltstatus = new JLabel("Salt: "+salt,JLabel.CENTER);
	    saltstatus.setSize(200,100);
	    frame.add(saltstatus);
	    final JLabel pepperstatus = new JLabel("Pepper: "+pepper,JLabel.CENTER);
	    pepperstatus.setSize(200,100);
	    frame.add(pepperstatus);
	    final JLabel oilstatus = new JLabel("Oil: "+oil,JLabel.CENTER);
	    oilstatus.setSize(200,100);
	    frame.add(oilstatus);
	    final JLabel oliveoilstatus = new JLabel("Olive Oil: "+oil, JLabel.CENTER);
	    oliveoilstatus.setSize(200,100);
	    frame.add(oliveoilstatus);
	    final JLabel butterstatus = new JLabel("Butter: "+butter,JLabel.CENTER);
	    butterstatus.setSize(200,100);
	    frame.add(butterstatus);
	    final JLabel onionstatus = new JLabel("Onions: "+onions,JLabel.CENTER);
	    onionstatus.setSize(200,100);
	    frame.add(onionstatus);
	    final JLabel mayonaisestatus = new JLabel("Mayo: "+mayonaise,JLabel.CENTER);
	    mayonaisestatus.setSize(200,100);
	    frame.add(mayonaisestatus);
		
		//Spinner
	    panel1.setLayout(new FlowLayout());
	    JLabel headerLabel= new JLabel("", JLabel.CENTER);
	    panel1.add(headerLabel);
	    headerLabel.setText("Qauntity of Ingredient"); 
	    SpinnerModel spinnerModel = new SpinnerNumberModel(1, 0, 100, 1);
	    final JSpinner spinner = new JSpinner(spinnerModel);
	    panel1.add(spinner);  
	    
	    //JTable
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    String[][] rowData = { { "Omlette", "Grilled Chicken", "Potato Salad"}, {"Egg Salad","Chicken Salad","Chicken Pot Pie"}, {"Cheese Omlette","Scrambled Eggs","Chicken Kiev"} };
	    String[] columnNames = { "Recipe 1", "Recipe 2", " Recipe 3" };
	    final JTable table = new JTable(rowData, columnNames);
	    	 
	    	table.addMouseListener(new MouseAdapter() {
	    		public void mouseClicked(MouseEvent e) {
	    			// check which column and row were selected
	    			int row = table.getSelectedRow();
	    			int col = table.getSelectedColumn();
	    			if(egg>=3){
	        	    	if(col==0 && row==0){
	        	    		URI uri;
	        	    		try {
	        	    			uri = new URI("https://www.youtube.com/watch?v=y-Wr401Bio4");
	        	    			click(uri);
	        	    		} catch (URISyntaxException e1) {
	        	    			// TODO Auto-generated catch block
	        	    			e1.printStackTrace();}
	        	    	}
	        	    }
	    			if(chicken>=1 && oil>=1&& salt>=1 && pepper>=1){
	    				if(col==1 && row==0){
	    					URI uri;
	    					try {
	    						uri = new URI("https://www.youtube.com/watch?v=H_JFUatl5Tk");
	    						click(uri);
	    					} catch (URISyntaxException e1) {
	    						// TODO Auto-generated catch block
	    						e1.printStackTrace();}
	    				}
	    			}
	        	    if(potato>=1 && tomato>=1 && mayonaise>=1){
	        	    	if(col==2 && row==0){
	        	    		URI uri;
	        	    		try {
	        	    			uri = new URI("https://www.youtube.com/watch?v=LkbVtMUshtk");
	        	    			click(uri);
	        	    		} catch (URISyntaxException e1) {
	        	    			// TODO Auto-generated catch block
	        	    			e1.printStackTrace();}
	        	    	}
	    			}
	        	    if(egg>=4 && mayonaise>=1 && salt>=1 && pepper>=1){
	        	    	if(col==0 && row==1){
	        	    		URI uri;
	        	    		try {
	        	    			uri = new URI("https://www.youtube.com/watch?v=Jx6NC-xc2N4");
	        	    			click(uri);
	        	    		} catch (URISyntaxException e1) {
	        	    			// TODO Auto-generated catch block
	        	    			e1.printStackTrace();}
	        	    	}
	        	    }
	        	    if(chicken>=1 && mayonaise>=1 && salt>=1 && pepper>=1){
	        	    	if(col==1 && row==1){
	        	    		URI uri;
	        	    		try {
	        	    			uri = new URI("https://www.youtube.com/watch?v=fOQ9svAVE7U");
	        	    			click(uri);
	        	    		} catch (URISyntaxException e1) {
	        	    			// TODO Auto-generated catch block
	        	    			e1.printStackTrace();}
	        	    	}
	        	    }
	        	    if(chicken>=1 && butter>=1 && tomato>=1 && potato>=1 && salt>=1 && pepper>=1){	
	        	    	if(col==2 && row==1){
	        	    		URI uri;
	        	    		try {
	        	    			uri = new URI("https://www.youtube.com/watch?v=t8E89lrV36A");
	        	    			click(uri);
	        	    		} catch (URISyntaxException e1) {
	        	    			// TODO Auto-generated catch block
	        	    			e1.printStackTrace();}
	        	    
	        	    	}
	        	    }
	        	    if(egg>=3 && cheese>=1 && salt>=1 && butter>=1 && salt>=1 && pepper>=1){
	        	    	if(col==0 && row==2){
	        	    		URI uri;
	        	    		try {
	        	    			uri = new URI("https://www.youtube.com/watch?v=PzWsyPHoSyQ");
	        	    			click(uri);
	        	    		} catch (URISyntaxException e1) {
	        	    			// TODO Auto-generated catch block
	        	    			e1.printStackTrace();}
	        	    	} 
	        	    }
	        	    if(egg>=3 && butter>=1 && pepper>=1 && salt>=1){
	        	    	if(col==1 && row==2){
	        	    		URI uri;
	        	    		try {
	        	    			uri = new URI("https://www.youtube.com/watch?v=Gf4eEhDpxgk");
	        	    			click(uri);
	        	    		} catch (URISyntaxException e1) {
	        	    			// TODO Auto-generated catch block
	        	    			e1.printStackTrace();}
	        	    	}
	        	    }
	        	    if(chicken>=1 && cheese>=1 && butter>=1 && salt>=1 && mushrooms>=1 && pepper>=1){	
	        	    	if(col==2 && row==2){
	        	    		URI uri;
	        	    		try {
	        	    			uri = new URI("https://www.youtube.com/watch?v=h3AvFdaej8Y");
	        	    			click(uri);
	        	    		} catch (URISyntaxException e1) {
	        	    			// TODO Auto-generated catch block
	        	    			e1.printStackTrace();}
	        	    	}
	        	    }
	        	}});
	    
	    

	    JScrollPane scrollPane = new JScrollPane(table);
	    frame.add(scrollPane, BorderLayout.CENTER);
	    frame.setVisible(true);
		
	    //Buttons to Add and Delete Food
		JButton jbtnAddFood = new JButton("Enter");
		jbtnAddFood.setPreferredSize(new Dimension(100,20));
		jbtnAddFood.setToolTipText("Press to add the food in the box to your fridge inventory");
		jbtnAddFood.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String newSelection = (String)ingList.getSelectedItem();
				int number = Integer.parseInt(spinner.getModel().getValue().toString());
				selectfood = newSelection;
				if(selectfood.equals("Tomato")){
					tomato+=number;
				    tomatostatus.setText("Tomatoes: "+tomato);
					
				}
				else if(selectfood.equals("Carrot")){
					carrot+=number;
					carrotstatus.setText("Carrots: "+carrot);
				}
				else if(selectfood.equals("Chicken")){
					chicken+=number;
					chickenstatus.setText("Chicken: "+chicken);
				}
				else if(selectfood.equals("Potato")){
					potato+=number;
					potatostatus.setText("Potatoes: "+potato);
				}
				else if(selectfood.equals("Egg")){
					egg+=number;
					eggstatus.setText("Eggs: "+egg);
					System.out.println(egg);
				}
				else if(selectfood.equals("Cheese")){
					cheese+=number;
					cheesestatus.setText("Cheese: "+cheese);
				}
				else if(selectfood.equals("Mushrooms")){
					mushrooms+=number;
					mushroomstatus.setText("Mushrooms: "+mushrooms);
				}
				else if(selectfood.equals("Salt")){
					salt+=number;
					saltstatus.setText("Salt: "+salt);
				}
				else if(selectfood.equals("Pepper")){
					pepper+=number;
					pepperstatus.setText("Pepper: "+pepper);
				}
				else if(selectfood.equals("Oil")){
					oil+=number;
					oilstatus.setText("Oil: "+oil);
				}
				else if(selectfood.equals("Olive Oil")){
					oliveoil+=number;
					oliveoilstatus.setText("Olive Oil: "+oliveoil);
				}
				else if(selectfood.equals("Butter")){
					butter+=number;
					butterstatus.setText("Butter: "+butter);
				}
				else if(selectfood.equals("Onions")){
					onions+=number;
					onionstatus.setText("Onions: "+onions);
				}
				else if(selectfood.equals("Mayonaise")){
					mayonaise+=number;
					mayonaisestatus.setText("Mayo: "+mayonaise);
				}
				
			                                           }
		                                                   });
		JButton jbtnDeleteFood = new JButton("Delete");
		jbtnDeleteFood.setPreferredSize(new Dimension(100, 20));
		jbtnDeleteFood.setToolTipText("Press to delete food items in your inventory");
		jbtnDeleteFood.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String newSelection = (String)ingList.getSelectedItem();
				int number = Integer.parseInt(spinner.getModel().getValue().toString());
				selectfood = newSelection;
				if(selectfood.equals("Tomato") && tomato-number>=0){
					tomato-=number;
					tomatostatus.setText("Tomatoes: "+tomato);
					System.out.println("You have "+tomato+" tomatoes");
				}
				else if(selectfood.equals("Carrot") && carrot-number>=0){
					carrot-=number;
					carrotstatus.setText("Carrots: "+carrot);
				}
				else if(selectfood.equals("Chicken") && chicken-number>=0){
					chicken-=number;
					chickenstatus.setText("Chicken: "+chicken);
				}
				else if(selectfood.equals("Potato") && potato-number>=0){
					potato-=number;
					potatostatus.setText("Potatoes: "+potato);
				}
				else if(selectfood.equals("Egg") && egg-number>=0){
					egg-=number;
					eggstatus.setText("Eggs: "+egg);
					System.out.println(egg);
				}
				else if(selectfood.equals("Cheese") && cheese-number>=0){
					cheese-=number;
					cheesestatus.setText("Cheese: "+cheese);
				}
				else if(selectfood.equals("Mushrooms") && mushrooms-number>=0){
					mushrooms-=number;
					mushroomstatus.setText("Mushrooms: "+mushrooms);
				}
				else if(selectfood.equals("Salt") && salt-number>=0){
					salt-=number;
					saltstatus.setText("Salt: "+salt);
				}
				else if(selectfood.equals("Pepper") && pepper-number>=0){
					pepper-=number;
					pepperstatus.setText("Pepper: "+pepper);
				}
				else if(selectfood.equals("Oil") && oil-number>=0){
					oil-=number;
					oilstatus.setText("Oil: "+oil);
				}
				else if(selectfood.equals("Olive Oil") && oliveoil-number>=0){
					oliveoil-=number;
					oliveoilstatus.setText("Olive Oil: "+oliveoil);
				}
				else if(selectfood.equals("Butter") && butter-number>=0){
					butter-=number;
					butterstatus.setText("Butter: "+butter);
				}
				else if(selectfood.equals("Onions")){
					onions-=number;
					onionstatus.setText("Onions: "+onions);
				}
				else if(selectfood.equals("Mayonaise") && mayonaise-number>=0){
					mayonaise-=number;
					mayonaisestatus.setText("Mayo: "+mayonaise);
				}	
			                                           }
		                                                   });
		background.add(jbtnAddFood);
		background.add(jbtnDeleteFood);
		frame.setSize(500, 550);
	}
	
	protected static void click(URI uri) {
		if (Desktop.isDesktopSupported()) {
			try {
				Desktop.getDesktop().browse(uri);
				} catch (IOException e) { /* TODO: error handling */ }
			} else { /* TODO: error handling */ } 
	}
	
	public static void main(String[] args) throws URISyntaxException {
		
		createAndShowGUI();
	}
}
