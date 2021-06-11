
package Stronger_antivirus;
//*************************************** Stronger Antivirus *****************************************************************************
//
//
//								Andrey Molokanov BVT1801
//********************************************************************************************************************************


import java.awt.Color;
import java.awt.Container;
import java.awt.Desktop;
import java.awt.FileDialog;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JWindow;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;


class Scanner extends JFrame {
	BufferedReader br = null;
	int ans = 0, point = 0;
	String[] database = new String[1000];
	int total = 0, infected = 0;
	String strRoot2 = "";
	FileWriter logFile;
	JLabel jl, jl2, jl3, jl4, img, img2, jb;
	Container bbb;
	Date dd;
	MenuBar mb;
	JButton o1, o2, o3, o4, o5;
	JButton jk1, jk2, jk3, jk4, jk5, b1, b2, b3, b4, b5, g1, g2, g3, max;
	JToolBar tb;
	JList<String> jh;
	Image panelImage;
	private BufferedImage backgroundImg;
	File autorun;
	int jdk = 1;
	DefaultListModel<String> mu;
	DefaultListModel ku;
	JInternalFrame jfq, jfq2, jfq3;
	JFrame jfs, jf;
	String drive;
	JComboBox<String> main;
	JTextField time;
	int dno = 0;
	int mylen = 0;
	int win32 = 0;
	String[] alert2 = new String[23];
	String[] drivecount = new String[23];
	int select = 1;
	ImageIcon image, image2;

	JPanel jjp, hide;
	JLabel hide1, hide2, hide3;
	JWindow kl;
	int files = 0, vir = 0, clean = 0;
	long start = -1, stop = -1;
	int vx, hx;
	private BufferedImage backgroundImg1;

	Scanner(int visible) {
		try {
			logFile = new FileWriter("Scan.log");
			logFile.write("*************************** Stronger Antivirus ****************************************" + "\r\n");
			logFile.write("                                           Andrey Molokanov BVT1801" + "\r\n");
			logFile.write("*********************************************************************************" + "\r\n");
			logFile.write("User Computer File's And Folder's System" + "\r\n\n\n");
		} catch (Exception ignored) { }
		while (true) {
			try {
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
//UIManager.setLookAndFeel ("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
			} catch (Exception ignored) { }
			try {
				ans = 0;
				FileWriter we = new FileWriter("Command.cab");
				we.write("0");
				we.close();
				kl = new JWindow();
				hide = new JPanel(null, true);

				hide1 = new JLabel();
				hide1.setBounds(10, 10, 400, 50);
				hide.add(hide1);

				max = new JButton("");
				max.setBounds(380, 0, 30, 30);
				hide.add(max);

				hide1.setBorder(
						BorderFactory.createCompoundBorder(
								BorderFactory.createTitledBorder("Scanning File"),
								BorderFactory.createEmptyBorder(1, 1, 1, 1)));

				hide2 = new JLabel();
				hide2.setBounds(10, 70, 400, 50);
				hide.add(hide2);

				hide2.setBorder(
						BorderFactory.createCompoundBorder(
								BorderFactory.createTitledBorder("Infected  File"),
								BorderFactory.createEmptyBorder(1, 1, 1, 1)));

				hide3 = new JLabel();
				hide3.setBounds(10, 120, 400, 50);
				hide.add(hide3);

				hide3.setBorder(
						BorderFactory.createCompoundBorder(
								BorderFactory.createTitledBorder("Scan Log"),
								BorderFactory.createEmptyBorder(1, 1, 1, 1)));

				hide.setBounds(0, 0, 420, 180);
				kl.add(hide);
				kl.setSize(420, 180);
				kl.setLocation(150, 180);
				if (visible == 0) {
					try {
						UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
					} catch (Exception ignored) { }
					kl.setVisible(true);
				}
				if (jdk == 1 && visible == 1) {
					kl.setVisible(false);
					jdk++;
					jf = new JFrame("Stronger Antivirus 1.0");
					jf.setLayout(null);
//jf.setIconImage(new ImageIcon("Image/map_systemsecurity.png"));
//URL backgroundImgUrl = this.getClass().getResource("/Image/map_systemsecurity.png");
//try {
//	backgroundImg = ImageIO.read(backgroundImgUrl);
//} catch (IOException e1) {
//	// TODO Auto-generated catch block
//	e1.printStackTrace();
//}
//jf.setIconImages(new ImageIcon(backgroundImg));
					jf.setLocation(50, 50);
					jf.setSize(730, 670);
					jf.setVisible(true);

					jfq2 = new JInternalFrame();
					jfq2.setMaximizable(true);
					jfq2.hide();
					jfq2.setSelected(true);
					jfq2.setClosable(true);
					jfq2.setTitle("Setting");
					jfq2.setLayout(null);
					jfq2.setLocation(410, 319);
					jfq2.setSize(150, 160);
					jfq2.setVisible(true);

					jjp = new JPanel(null, true);
					jjp.setBounds(420, 480, 140, 150);
					jf.add(jjp);
					URL backgroundImgUrl = this.getClass().getResource("/Image/ScanStart.gif");
					URL backgroundImgUrl1 = this.getClass().getResource("/Image/Scan.gif");
					try {
						backgroundImg = ImageIO.read(backgroundImgUrl);
						backgroundImg1 = ImageIO.read(backgroundImgUrl1);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					image = new ImageIcon(backgroundImg);
					image2 = new ImageIcon(backgroundImg1);

					jfq = new JInternalFrame();
					jfq.setMaximizable(true);
					jfq.hide();
					jfq.setSelected(true);
					jfq.setClosable(true);
					jfq.setResizable(true);
					jfq.setTitle("User Choice");
					jfq.setLayout(null);
					jfq.setLocation(410, 25);
					jfq.setSize(150, 290);
					jfq.setVisible(true);

					jfq3 = new JInternalFrame();
					jfq3.setMaximizable(true);
					jfq3.hide();
					jfq3.setSelected(true);
					jfq3.setClosable(true);
					jfq3.setResizable(true);
					jfq3.setTitle("My Task");
					jfq3.setLayout(null);
					jfq3.setLocation(570, 25);
					jfq3.setSize(150, 290);
					jfq3.setVisible(true);

					jf.add(jfq);
					jf.add(jfq2);
					jf.add(jfq3);

					o1 = new JButton("Drive Details");
					o1.setBounds(10, 10, 120, 30);
					jfq3.add(o1);

					o2 = new JButton("Minimum Mode");
					o2.setBounds(10, 50, 120, 30);
					jfq3.add(o2);
					o3 = new JButton("Clean Computer");
					o3.setBounds(10, 90, 120, 30);
					jfq3.add(o3);

					o4 = new JButton("Update");
					o4.setBounds(10, 130, 120, 30);
					jfq3.add(o4);

					o5 = new JButton("Register");
					o5.setBounds(10, 170, 120, 30);
					jfq3.add(o5);

					tb = new JToolBar();
					tb.setBounds(0, 1, 400, 30);
					jf.add(tb);

					img = new JLabel(image);
					img.setBounds(06, 50, 30, 30);
					img.setVisible(false);
					jf.add(img);

					img2 = new JLabel(image2);
					img2.setBounds(30, 35, 60, 60);
					img2.setVisible(false);
					jjp.add(img2);

					jl = new JLabel("Scan File:  ");
					jl.setBounds(30, 30, 380, 60);
					jl.setVisible(true);
					jf.add(jl);

					jl2 = new JLabel("Last Infected File:");
					jl2.setBounds(30, 90, 380, 60);
					jl2.setVisible(true);
					jf.add(jl2);

					jb = new JLabel();
					jb.setBounds(15, 95, 120, 30);
					jjp.add(jb);

					hx = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
					vx = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;

					mu = new DefaultListModel<String>();
					jh = new JList<String>(mu);

					ku = new DefaultListModel();
					main = new JComboBox<>();
					main.addItem("Select Drive");

					try {
						File f = new File("c:/'.'");
						File[] strRoot = File.listRoots();

						System.out.println("System Drive...");
						dno = strRoot.length;
						for (int k = 0; k < strRoot.length; k++) {
							drivecount[k] = strRoot[k] + "";
							main.addItem(strRoot[k] + "");
							drivecount[dno] = Arrays.toString(strRoot) + "";
							autorun = new File(strRoot[k] + "autorun.inf");
							if (autorun.exists()) {
								//main.addItem(strRoot[vir]+"");
								autorunFound a = new autorunFound(strRoot[k] + "");
								a.setVisible(true);
								a.setSize(400, 200);
								a.setLocation(100, 150);
								//alert2[]=strRoot[k]+"";
							}
							//dno++;
						}
					} catch (Exception ignored) { }
					jh.setForeground(Color.red);
					JScrollPane df = new JScrollPane(jh, vx, hx);

					b1 = new JButton("|View Log|");
					b1.setBounds(0, 1, 100, 30);
					tb.add(b1);

					b2 = new JButton("|View File Log|");
					b2.setBounds(0, 1, 100, 30);
					tb.add(b2);

					b4 = new JButton("|Change Themes|");
					b4.setBounds(0, 1, 100, 30);
					tb.add(b4);

					b3 = new JButton("|About|");
					b3.setBounds(0, 1, 100, 30);
					tb.add(b3);


					df.setBorder(
							BorderFactory.createCompoundBorder(
									BorderFactory.createTitledBorder("Virus List"),
									BorderFactory.createEmptyBorder(1, 1, 1, 1)));
					jjp.setBorder(
							BorderFactory.createCompoundBorder(
									BorderFactory.createTitledBorder("File Status"),
									BorderFactory.createEmptyBorder(1, 1, 1, 1)));


					df.setBounds(10, 150, 400, 300);
					jf.add(df);

					jl3 = new JLabel("Scan Log");
					jl3.setBounds(10, 450, 400, 60);
					jf.add(jl3);


					JPanel jk = new JPanel(null, true);

					jl4 = new JLabel("Software: Stronger Antivirus");
					jl4.setBounds(20, 20, 400, 30);
					jk.add(jl4);

					jk.setBounds(10, 510, 400, 120);
					jf.add(jk);

					jk.setBorder(
							BorderFactory.createCompoundBorder(
									BorderFactory.createTitledBorder("Information"),
									BorderFactory.createEmptyBorder(1, 1, 1, 1)));

					jk1 = new JButton("Scan All Drive");
					jk1.setDefaultCapable(false);
					jk1.setBounds(10, 10, 120, 30);
					jfq.add(jk1);

					g1=new JButton("Open database");
					g1.setDefaultCapable(false);
					g1.removeNotify();
					g1.setBounds(10,10,120,30);
					jfq2.add(g1);

					g2=new JButton("Scheduled scan");
					g2.setDefaultCapable(false);
					g2.removeNotify();
					g2.setBounds(10,50,120,30);
					jfq2.add(g2);
					time = new JTextField();
					time.removeNotify();
					time.setBounds(10, 90, 120, 30);
					jfq2.add(time);

					jk2 = new JButton("Scan System Drive");
					jk2.setBounds(10, 50, 120, 30);
					jfq.add(jk2);

					jk3 = new JButton("Scan User Drive");
					jk3.setBounds(10, 90, 120, 30);
					jfq.add(jk3);

					main.setBounds(10, 130, 120, 30);
					jfq.add(main);

					jk4 = new JButton("Scan Folder");
					jk4.setBounds(10, 170, 120, 30);
					jfq.add(jk4);

					jk5 = new JButton("Scan File");
					jk5.setBounds(10, 210, 120, 30);
					jfq.add(jk5);
				}
				max.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						kl.setVisible(false);
						jf.setVisible(true);
					}
				});

				g1.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e) {
						File currentDir = new File(".");
						String basePath = null;
						try {
							basePath = currentDir.getCanonicalPath();
						} catch (Exception ex) {
							ex.printStackTrace();
						}
						File file = new File(basePath + "\\src\\virus_database\\viruses.txt");
						Desktop desktop = Desktop.getDesktop();
						try {
							desktop.open(file);
						} catch (Exception ex) {
							ex.printStackTrace();
						}
					}
				});
				/*new Timer().scheduleAtFixedRate(new TimerTask() {//schedule(), если через
					@Override
					public void run() {
						int n = ThreadLocalRandom.current().nextInt(1,3);
						for (int i = 0; i < n; i++) {
							new Thread(() -> {
								try {
									FileWriter we = new FileWriter("Command.cab");
									we.write("4");
									we.close();
								}
								catch (Exception ifg) {
									ifg.printStackTrace();
								}
							}).start();
						}
					}
				},0, t);*/
				g2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						var k = time.getText();
						int t = 30000;
						try {
							t = Integer.parseInt(k)*1000;
						}
						catch (Exception ignored) { }
						int finalT = t;
						new Thread(() -> {
							try {
								FileWriter we = new FileWriter("Command.cab");
								we.write("4");
								we.close();
							}
							catch (Exception ignored) {
							}
							try {
								Thread.sleep(finalT);
							} catch (InterruptedException interruptedException) {
								interruptedException.printStackTrace();
							}
						}).start();
					}
				});

				b1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							FileWriter ww = new FileWriter("1.bat");
							ww.write("@echo off" + "\n\r"
									+ "start Scan.log \r\n"
									+ "exit");
							ww.close();
							FileWriter ww1 = new FileWriter("2.bat");
							ww1.write("@echo off" + "\n\r"
									+ "start 1.bat \n\r"
									+ "exit");
							ww1.close();
							Runtime qq = Runtime.getRuntime();
							qq.exec("2.bat");
							Thread.sleep(1000);
							File fv = new File("2.bat");
							fv.delete();
							File fv1 = new File("1.bat");
							fv1.delete();
						} catch (Exception ignored) { }
					}
				});
				b2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							FileWriter ww = new FileWriter("1.bat");
							ww.write("@echo off" + "\n\r"
									+ "start Total_Files.log \r\n"
									+ "exit");
							ww.close();
							FileWriter ww1 = new FileWriter("2.bat");
							ww1.write("@echo off" + "\n\r"
									+ "start 1.bat \n\r"
									+ "exit");
							ww1.close();
							Runtime qq = Runtime.getRuntime();
							qq.exec("2.bat");
							Thread.sleep(1000);
							File fv = new File("2.bat");
							fv.delete();
							File fv1 = new File("1.bat");
							fv1.delete();
						} catch (Exception ignored) { }
					}
				});
				b4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
						} catch (Exception ignored) { }
					}
				});
				b3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							JFrame jfc = new JFrame("About Us");
							jfc.setVisible(true);
							jfc.setLocation(100, 100);
							jfc.setSize(400, 470);
							jfc.setLayout(null);
							ImageIcon gh = new ImageIcon("/Image/final.png");
							URL backgroundImgUrl = this.getClass().getResource("/Image/final.png");
							try {
								panelImage = ImageIO.read(backgroundImgUrl);
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							JPanel panel = new JPanel() {
								public void paintComponent(Graphics g) {
									super.paintComponent(g);
									g.drawImage(panelImage, 0, 0, 400, 170, this);
								}
							};
							panel.setLayout(null);
							panel.setBounds(0, 0, 400, 170);

							JLabel jl = new JLabel(gh);
							jl.setBounds(60, 20, 160, 140);
							jfc.add(panel);

							JTextArea rr = new JTextArea("About Us");
							rr.setBackground(Color.black);
							rr.setForeground(Color.red);
							rr.setBounds(00, 170, 400, 280);
							rr.setEditable(false);

							JScrollPane hhq = new JScrollPane(rr, vx, hx);

							jfc.add(rr);

							rr.setText(rr.getText() + "\n\rSoftware Name: Stronger Antivirus \n");
							rr.setText(rr.getText() + "Version Info: 1.0. \n");
							rr.setText(rr.getText() + "Author: Andrey Molokanov BVT1801 \n");
							rr.setText(rr.getText() + "Requirement: JDK 1.14 \n");
							rr.setText(rr.getText() + "Feedback on: \n");
							rr.setText(rr.getText() + "strongero4ek@mail.ru \n");
						} catch (Exception ignored) { }
					}
				});

				o1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						driveDetail d = new driveDetail("c:/");
						d.setVisible(true);
						d.setSize(400, 235);
						d.setLocation(150, 100);
					}
				});

				o2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						kl.setVisible(true);
						jf.setVisible(false);

					}
				});
				o3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						splash sp = new splash();
						sp.setVisible(true);
						sp.setSize(297, 280);
						sp.setLocation(150, 100);
						sp.setVisible(false);
					}
				});
				o4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});

				o5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Register reg = new Register();
					}
				});


				jk1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							FileWriter we = new FileWriter("Command.cab");
							we.write("1");
							we.close();
						} catch (Exception ignored) { }
					}
				});

				jk2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							FileWriter we = new FileWriter("Command.cab");
							we.write("2");
							we.close();
						} catch (Exception fr) {
							fr.printStackTrace();
						}
					}
				});

				main.addItemListener(new ItemListener() {
					public void itemStateChanged(ItemEvent e) {
						try {
							String str = (String) main.getSelectedItem();
							System.out.println(str);

//File ff=new File("");

						} catch (Exception de) {
							System.out.println(de);
						}
					}
				});


				jk3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							File ffh = new File("drive.cab");
							if (ffh.exists()) {
								FileReader fr = new FileReader("drive.cab");
								JTextField hj = new JTextField();
								hj.read(fr, null);
								fr.close();
								drive = hj.getText();

								kl.setVisible(true);
								jf.setVisible(false);

								main.setSelectedItem(hj);
								File ffhw = new File("drive.cab");
								ffhw.delete();
							} else {
								String str = (String) main.getSelectedItem();
								drive = str;
							}

							if (drive.equals("Select Drive")) {
								JOptionPane.showMessageDialog(null, "Please Select drive from Drive list", "Drive Loading error", JOptionPane.ERROR_MESSAGE);
							} else {
								System.out.println(drive);
								FileWriter we = new FileWriter("Command.cab");
								we.write("3");
								we.close();
							}
						} catch (Exception fr) {
							System.out.println(fr);
						}
					}
				});


				jk4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							FileWriter we = new FileWriter("Command.cab");
							we.write("4");
							we.close();
						} catch (Exception ignored) {
						}
					}
				});

				jl.setBorder(
						BorderFactory.createCompoundBorder(
								BorderFactory.createTitledBorder("File"),
								BorderFactory.createEmptyBorder(1, 1, 1, 1)));


				jl2.setBorder(
						BorderFactory.createCompoundBorder(
								BorderFactory.createTitledBorder("Infection"),
								BorderFactory.createEmptyBorder(1, 1, 1, 1)));


				jl3.setBorder(
						BorderFactory.createCompoundBorder(
								BorderFactory.createTitledBorder("Status"),
								BorderFactory.createEmptyBorder(1, 1, 1, 1)));


			} catch (Exception ignored) {
			}


//Scan All Drives


			img.setVisible(false);
			img2.setVisible(false);
			jb.setText("");
			while (ans == 0) {
				try {
					FileReader rd = new FileReader("Command.cab");
					JTextField jt = new JTextField();
					jt.read(rd, null);
					rd.close();
					ans = Integer.parseInt(jt.getText());

					if (select == 1) {
						jfq.setSelected(true);
						jfq3.setSelected(true);
						jfq2.setSelected(true);
						select++;
					}
					try {

						File f = new File("c:/'.'");

						File[] strRoot = File.listRoots();
						win32 = 0;
						//System.out.println("Current1..."+dno);
						//System.out.println("Current2..."+mylen);
						win32 = 0;
						mylen = strRoot.length;
						for (int k = 0; k < strRoot.length; k++) {
							if (mylen > dno) {
								mu.removeAllElements();
								if (win32 == 0) {
									JOptionPane.showMessageDialog(null, "New Removable Drive is Connected to Computer...\r\n" + "Please wait while drive loading...\r\n" + "It may take a Minute...", "Removable Drive Loading", 1);
									Thread.sleep(10000);
									win32 = 1;
								}
								for (int j = 0; j < mylen; j++) {
									if (j == mylen - 1) {
										main.addItem(strRoot[j] + "");
										System.out.println("Drive Detail" + strRoot[j]);
										driveDetail d = new driveDetail(strRoot[j] + "");
										d.setVisible(true);
										d.setSize(400, 235);
										d.setLocation(150, 100);
									}
								}
								for (int j = 0; j < mylen; j++) {
									autorun = new File(strRoot[j] + "autorun.inf");
									//System.out.println("Checking: "+strRoot[j]+"autorun.inf");
									Thread.sleep(1000);
									k = mylen;
									dno = mylen;

									if (autorun.exists()) {
										try {
											win32 = j;


											//System.out.println("Found Checking: "+strRoot[j]+"autorun.inf");
											autorunFound a2 = new autorunFound(strRoot[j] + "");
											a2.setVisible(true);
											a2.setSize(400, 200);
											a2.setLocation(100, 150);
											System.out.println("Warning");

										} catch (Exception d) {
											System.out.println(d);
										}
									}


								}
								// System.out.println("New Drive added");

								//System.out.println("New Drive Volume"+strRoot[win32]);
							}
							if (mylen < dno) {
								JOptionPane.showMessageDialog(null, "The Removable Drive Disconnected...", "Removable Drive Disconnected", 1);
								for (int j2 = 0; j2 < mylen; j2++) {
									mu.removeAllElements();
									main.addItem(strRoot[j2] + "");
									dno = mylen;
								}
							}

						}


					} catch (Exception gt) {
						System.out.println(gt);
					}


				} catch (Exception hy) {
					System.out.println(hy);
				}

			}

			if (ans == 1) {
				try {
					mu.removeAllElements();

					jf.setVisible(true);
					img.setVisible(true);
					img2.setVisible(true);
					o2.setEnabled(true);
					start = System.currentTimeMillis();

					try {
						FileReader rd = new FileReader("//virus_database//point.dat");
						JTextField jt = new JTextField();
						jt.read(rd, null);
						point = Integer.parseInt(jt.getText());
						rd.close();
					} catch (Exception e) {
						e.printStackTrace();
					}


					//System.out.print("Please wait Loading Database");

					jl.setText("");
					jl.setText("Please wait Loading Database");
					hide1.setText("Please wait Loading Database");
					for (int z = 0; z < point; z++) {
						FileReader r = new FileReader("//virus_database//malware" + z + ".res");
						JTextField jt2 = new JTextField();
						jt2.read(r, null);
						database[z] = jt2.getText();
						r.close();
						int per = (z * 100) / point;
					}
					for (int x = 0; x < 4; x++) {
						for (int y = 0; y < 3; y++)
							System.out.print(jl.getText() + ". ");

						jl.setText(".");
						try {
							Thread.sleep(500);
						} catch (Exception ignored) {
						}
					}

					System.out.println("Database Load Successfully!");

					File f = new File("c:/'.'");

					File[] strRoot = File.listRoots();


					System.out.println("System Drive...");
					Arrays.stream(strRoot).map(file -> " |_" + file).forEach(System.out::println);

					System.out.println("Start Scan...");
					jl.setText("");
					jl.setText("Please wait Start Scan");


					logFile.write("Start Scan:" + new Date() + "\r\n");

					int j = 0, strRootLength = strRoot.length;
					while (j < strRootLength) {
						File file = strRoot[j];
						System.out.println("\n\n\n" + file + " Drive");
						logFile.write("\n\n\n" + file + " Drive" + "\r\n");

						File ff2 = new File(file + "/*.*");
						String ff1 = ff2.getParent();
						File ff = new File(ff1);
						String[] str22 = ff.list();
						int len = str22.length;

						for (int i = 0; i < len; i++) {

							if (i == len - 1) {
								jl.setText("Scan Completed !!!");
							}

							File fg = new File(file + "/" + str22[i]);
							jl.setText("");
							jl.setText("Scanning File: " + file + "/" + str22[i]);
							jb.setText(str22[i]);
							hide1.setText("Scanning File: " + file + "/" + str22[i]);
							jb.setText(str22[i]);
							files++;
							clean++;
							jl3.setText("Scan File's: " + files + "\n\r" + "  Clean Files: " + clean + "\n\r" + "  Infected File: " + vir + "\n\r");
							hide3.setText("Scan File's: " + files + "\n\r" + "  Clean Files: " + clean + "\n\r" + "  Infected File: " + vir + "\n\r");


							System.out.println(" |_ " + str22[i]);


							logFile.write(" |_ " + str22[i] + "\r\n");
							try {
								Thread.sleep(100);
							} catch (Exception ignored) {
							}

							total = total + 1;
							for (int io = 0; io < point; io++) {    //System.out.println("List "+database[io]);

								if (database[io].equals(str22[i])) {


									virus v = new virus(file + str22[i]);
									jl.setText("");
									jl.setForeground(Color.red);
									jl.setText("Scanning File: " + file + "/" + str22[i]);
									jb.setText(str22[i]);
									hide1.setText("Scanning File: " + file + "/" + str22[i]);
									jb.setText(str22[i]);
									mu.addElement(file + str22[i] + "({Trojan Horse}) Action:(File Modified)");
									infected = infected + 1;
								}
							}
							int iz = str22[i].lastIndexOf('.');
							if (fg.isHidden() && str22[i].substring(iz + 1).equalsIgnoreCase("exe") || str22[i].substring(iz + 1).equalsIgnoreCase("msi") || str22[i].substring(iz + 1).equalsIgnoreCase("pif")) {
								jl.setText("");
								jl.setForeground(Color.red);
								jl2.setForeground(Color.red);
								jl2.setText("Last Infected File:" + file + str22[i] + "(Suspicious File)");
								hide2.setText("Last Infected File:" + file + str22[i] + "(Suspicious File)");
								System.out.println("\n\n************* Virus Found ***********");
								System.out.println("Possibly a new Virus");
								virus v = new virus(file + str22[i]);
								mu.addElement(file + str22[i] + "(Suspicious File) Action:(File Modified)");
								vir++;
							}
							String dir = fg.getParent();
							File fy = new File(dir);
							String name = fy.getName();
							if (str22[i].equals(name + ".exe")) {
								jl.setText("");
								jl.setForeground(Color.red);
								jl.setText("Scanning File:  " + file + "/" + str22[i]);
								jb.setText(str22[i]);
								hide1.setText("Scanning File:  " + file + "/" + str22[i]);
								jb.setText(str22[i]);
								jl2.setForeground(Color.red);
								jl2.setText("Last Infected File:" + file + str22[i] + "(Win32-sality[trojan])");
								hide2.setText("Last Infected File:" + file + str22[i] + "(Win32-sality[trojan])");

								System.out.println("\n\n****************** $Virus Found$ ****************");
								System.out.println("                       Virus Name: Win32-Sality[Trojan]");
								virus v = new virus(file + str22[i]);
								infected = infected + 1;
								mu.addElement(file + str22[i] + "(Win32-sality[trojan]) Action:(File Modified)");
								vir++;
							}
							if (fg.isDirectory()) {
								try {
									File ff21 = new File(file + str22[i] + "/*.*");
									String ff11 = ff21.getParent();
									//System.out.println("Directory Name:"+ff11);
									File ff1a = new File(ff11);
									String[] str221 = ff1a.list();
									int len1 = str221.length;

									int i1 = 0, str221Length = str221.length;
									while (i1 < str221Length) {
										String item = str221[i1];
										files++;
										clean++;
										System.out.println(" |   |_ " + item);
										jl.setText("");
										jl.setForeground(Color.black);
										jl.setText("Scanning File:  " + file + "/" + str22[i] + "/" + item);
										jb.setText(item);
										hide1.setText("Scanning File:  " + file + "/" + str22[i] + "/" + item);
										jb.setText(item);

										jl3.setText("Scan File's: " + files + "\n\r" + "  Clean Files: " + clean + "\n\r" + "  Infected File: " + vir + "\n\r");
										hide3.setText("Scan File's: " + files + "\n\r" + "  Clean Files: " + clean + "\n\r" + "  Infected File: " + vir + "\n\r");

										logFile.write(" |   |_ " + item + "\r\n");
										try {
											Thread.sleep(100);
										} catch (Exception ignored) {
										}
										total = total + 1;
										for (int io = 0; io < point; io++) {
											if (database[io].equals(item)) {
												jl2.setForeground(Color.red);
												jl2.setText("Last Infected File:" + item + "([trojan-gender])");
												hide2.setText("Last Infected File:" + item + "([trojan-gender])");
												System.out.println("\n\n************* Virus Found ***********");
												virus v = new virus(file + str22[i] + "/" + item);
												System.out.println("2." + file + str22[i] + "/" + item);
												vir++;
												infected = infected + 1;
												mu.addElement(item + "([trojan-gender]) Action:(File Modified)");
											}
										}
										File fh = new File(file + str22[i] + "/" + item);
										int iz1 = item.lastIndexOf('.');
										if (fh.isHidden() && item.substring(iz1 + 1).equalsIgnoreCase("exe") || item.substring(iz1 + 1).equalsIgnoreCase("msi") || item.substring(iz1 + 1).equalsIgnoreCase("pif")) {
											jl.setText("");
											jl.setForeground(Color.red);
											jl.setText("Scanning File:  " + file + str22[i] + "/" + item);
											jb.setText(str22[i]);
											hide1.setText("Scanning File:  " + file + str22[i] + "/" + item);
											jb.setText(str22[i]);
											jl2.setForeground(Color.red);
											jl2.setText("Last Infected File:" + item + "([trojan-gender])");
											hide2.setText("Last Infected File:" + item + "([trojan-gender])");
											vir++;
											System.out.println("\n\n************* Virus Found ***********");
											System.out.println("Possibly a new Virus");
											virus v = new virus(file + str22[i] + "/" + item);
											mu.addElement(item + "([trojan-gender]) Action:(File Modified)");
										}
										String dir1 = fh.getParent();
										File fy1 = new File(dir1);
										String name1 = fy1.getName();
										if (item.equals(name1 + ".exe")) {
											jl.setText("");
											jl.setForeground(Color.red);
											jl.setText("Scanning File:  " + file + str22[i] + "/" + item);
											jb.setText(str22[i]);
											hide1.setText("Scanning File:  " + file + str22[i] + "/" + item);
											jb.setText(str22[i]);
											jl2.setForeground(Color.red);
											jl2.setText("Last Infected File:" + str22[i] + "([win32-sality])");
											hide2.setText("Last Infected File:" + str22[i] + "([win32-sality])");
											vir++;
											System.out.println("\n\n****************** Virus Found ****************");
											System.out.println("                       Virus Name: Win32-Sality[Trojan]");
											virus v = new virus(file + str22[i] + "/" + item);
											infected = infected + 1;
											mu.addElement(str22[i] + "([win32-sality]) Action:(File Modified)");
										}
										if (fh.isDirectory()) {
											File ff21a = new File(file + str22[i] + "/" + item + "/*.*");
											String ff11a = ff21a.getParent();
											File ff1az = new File(ff11a);
											String[] str221a = ff1az.list();
											int len1a = str221a.length;
											int i2 = 0, str221aLength = str221a.length;
											while (i2 < str221aLength) {
												String value = str221a[i2];
												files++;
												clean++;
												System.out.println(" |   |   |_" + value);
												jl.setText("");
												jl.setForeground(Color.black);
												jl.setText("Scanning File:  " + file + str22[i] + "/" + value);
												jb.setText(value);
												hide1.setText("Scanning File:  " + file + str22[i] + "/" + value);
												jb.setText(value);
												jl3.setText("Scan File's: " + files + "\n\r" + "  Clean Files: " + clean + "\n\r" + "  Infected File: " + vir + "\n\r");
												hide3.setText("Scan File's: " + files + "\n\r" + "  Clean Files: " + clean + "\n\r" + "  Infected File: " + vir + "\n\r");
												logFile.write(" |   |   |_" + value + "\r\n");
												try {
													Thread.sleep(50);
												} catch (Exception ignored) {
												}
												total = total + 1;
												for (int ioa = 0; ioa < point; ioa++) {
													if (database[ioa].equals(value)) {
														jl.setText("");
														jl.setForeground(Color.red);
														jl.setText("Scanning File:  " + file + str22[i] + "/" + value);
														jb.setText(value);
														hide1.setText("Scanning File:  " + file + str22[i] + "/" + value);
														jb.setText(value);
														jl2.setForeground(Color.red);
														jl2.setText("Last Infected File:" + str22[i] + "([trojan-gender])");
														hide2.setText("Last Infected File:" + str22[i] + "([trojan-gender])");
														vir++;
														System.out.println("\n\n************* Virus Found ***********");
														virus v = new virus(file + str22[i] + "/" + item + "/" + value);
														//System.out.println("3."+strRoot[iq]+str22[i]+"/"+str221[i1]+"/"+str221a[i1a]);
														mu.addElement(str22[i] + "([trojan-gender]) Action:(File Modified)");
														infected = infected + 1;
													}
												}

												File ffg = new File(file + str22[i] + "/" + item + "/" + value);
												int iz11 = value.lastIndexOf('.');
												if (ffg.isHidden() && value.substring(iz11 + 1).equalsIgnoreCase("exe") || value.substring(iz11 + 1).equalsIgnoreCase("msi") || value.substring(iz11 + 1).equalsIgnoreCase("pif")) {
													jl.setText("");
													jl.setForeground(Color.red);
													jl.setText("Scanning File:  " + file + str22[i] + "/" + value);
													jb.setText(value);
													hide1.setText("Scanning File:  " + file + str22[i] + "/" + value);
													jb.setText(value);
													jl2.setForeground(Color.red);
													jl2.setText("Last Infected File:" + value + "([Suspicious File])");
													hide2.setText("Last Infected File:" + value + "([Suspicious File])");
													System.out.println("\n\n************* Virus Found ***********");
													System.out.println("Possibly a new Virus");
													virus v = new virus(file + str22[i] + "/" + value);
													vir++;
													mu.addElement(value + "([Suspicious File]) Action:(File Modified)");
												}

												String dir2 = ffg.getParent();
												File fy2 = new File(dir2);
												String name2 = fy2.getName();
												if (value.equals(name2 + ".exe")) {
													jl.setText("");
													jl.setForeground(Color.red);
													jl.setText("Scanning File:  " + file + str22[i] + "/" + value);
													jb.setText(value);
													hide1.setText("Scanning File:  " + file + str22[i] + "/" + value);
													jb.setText(value);
													jl2.setForeground(Color.red);
													jl2.setText("Last Infected File:" + value + "([Win32-sality])");
													hide2.setText("Last Infected File:" + value + "([Win32-sality])");
													System.out.println("\n\n****************** Virus Found ****************");
													System.out.println("                       Virus Name: Win32-Sality[Trojan]");
													virus v = new virus(file + str22[i] + "/" + item + "/" + value);
													infected = infected + 1;
													vir++;
													mu.addElement(value + "([Malware]) Action:(File Modified)");
												}
												if (ffg.isDirectory()) {
													File ff21a1 = new File(file + str22[i] + "/" + item + "/*.*");
													String f11 = ff21a1.getParent();
													System.out.println("Directory Name:" + f11);
													File f111 = new File(f11);
													String[] str1z = f111.list();
													int l1 = str1z.length;
													int k = 0, str1zLength = str1z.length;
													while (k < str1zLength) {
														String s = str1z[k];
														files++;
														clean++;
														System.out.println(" |   |   |  |_" + s);
														try {
															Thread.sleep(50);
														} catch (Exception ignored) { }
														jl.setText("");
														jl.setForeground(Color.black);
														jl.setText("Scanning File:  " + file + str22[i] + "/" + item + "/" + s);
														jb.setText(s);
														hide1.setText("Scanning File:  " + file + str22[i] + "/" + item + "/" + s);
														jb.setText(s);
														jl3.setText("Scan File's: " + files + "\n\r" + "  Clean Files: " + clean + "\n\r" + "  Infected File: " + vir + "\n\r");
														hide3.setText("Scan File's: " + files + "\n\r" + "  Clean Files: " + clean + "\n\r" + "  Infected File: " + vir + "\n\r");
														logFile.write(" |   |   |  |_" + s + "\r\n");
														total = total + 1;
														for (int za = 0; za < point; za++) {
															if (database[za].equals(s)) {
																jl.setText("");
																jl.setForeground(Color.red);
																jl.setText("Scanning File:  " + file + str22[i] + "/" + s);
																jb.setText(s);
																jl2.setForeground(Color.red);
																jl2.setText("Last Infected File:" + s + "([Suspicious File])");
																hide2.setText("Last Infected File:" + s + "([Suspicious File])");
																mu.addElement(s + "([Suspicious File]) Action:(File Modified)");
																System.out.println("\n\n************* Virus Found ***********");
																virus v = new virus(file + str22[i] + "/" + item + "/" + value + "/" + s);
																System.out.println("3." + file + str22[i] + "/" + item + "/" + value + "/" + s);
																vir++;
																infected = infected + 1;
															}
														}
														k++;
													}
												}
												i2++;
											}
										}
										i1++;
									}
								} catch (Exception h) {
									System.out.println(h);
								}
							}
						}
						j++;
					}

				} catch (Exception gt) {
					System.out.println(gt);
				}

			}
//Start
			if (ans == 4) {
				try {
					img.setVisible(true);
					img2.setVisible(true);
					vir = 0;
					clean = 0;
					mu.removeAllElements();
					files = 0;
					FileDialog fd = new FileDialog(jf, "Select Folder to Scan");
					fd.setVisible(true);
					String dir = fd.getDirectory();
					String path = fd.getName();
					o2.setEnabled(true);
					try {
						FileWriter wed = new FileWriter("Command.cab");
						wed.write("0");
						wed.close();
					} catch (Exception ignored) { }
					Thread.sleep(10000);
					jl.setText("");
					jl.setText("Please wait Loading Database");
					for (int z = 0; z < point; z++) {
						FileReader r = new FileReader("//virus_database//malware" + z + ".res");
						JTextField jt2 = new JTextField();
						jt2.read(r, null);
						database[z] = jt2.getText();
						r.close();
					}
					for (int x = 0; x < 4; x++) {
						for (int y = 0; y < 3; y++)
							System.out.print(". ");
						jl.setText(jl.getText() + ".");
						try {
							Thread.sleep(500);
						} catch (Exception ignored) {
						}
					}
					File ff = new File(dir);
					String[] str22 = ff.list();
					int len = str22.length;
					for (int i = 0; i < len; i++) {
						if (i == len - 1) jl.setText("Scan Completed!");
						File fg = new File(dir + "/" + str22[i]);
						jl.setText("");
						jl.setText("Scanning File: " + dir + "/" + str22[i]);
						jb.setText(str22[i]);
						files++;
						clean++;
						jl3.setText("Scan File's: " + files + "\n\r" + "  Clean Files: " + clean + "\n\r" + "  Infected File: " + vir + "\n\r");
						for (int io = 0; io < point; io++) {
							if (database[io].equals(str22[i])) {
								virus v = new virus(dir + str22[i]);
								jl.setText("");
								jl.setForeground(Color.red);
								jl.setText("Scanning File: " + dir + "/" + str22[i]);
								jb.setText(str22[i]);
								mu.addElement(dir + str22[i] + "({Trojan Horse}) Action:(File Modified)");
								infected = infected + 1;
							}
						}

						int iz = str22[i].lastIndexOf('.');
						if (fg.isHidden() && str22[i].substring(iz + 1).equalsIgnoreCase("exe") || str22[i].substring(iz + 1).equalsIgnoreCase("msi") || str22[i].substring(iz + 1).equalsIgnoreCase("pif")) {
							jl.setText("");
							jl.setForeground(Color.red);
							jl2.setForeground(Color.red);
							jl2.setText("Last Infected File:" + dir + str22[i] + "(Suspicious File)");
							System.out.println("\n\n************* Virus Found ***********");
							System.out.println("Possibly a new Virus");
							virus v = new virus(dir + str22[i]);
							mu.addElement(dir + str22[i] + "(Suspicious File) Action:(File Modified)");
							vir++;
						}

						String dir1 = fg.getParent();
						File fy = new File(dir1);
						String name = fy.getName();
						if (str22[i].equals(name + ".exe")) {
							jl.setText("");
							jl.setForeground(Color.red);
							jl.setText("Scanning File:  " + dir + str22[i]);
							jb.setText(str22[i]);
							jl2.setForeground(Color.red);
							jl2.setText("Last Infected File:" + dir + str22[i] + "(Win32-sality[Trojan])");
							System.out.println("\n\n****************** Virus Found ****************");
							System.out.println("                       Virus Name: Win32-Sality[Trojan]");
							virus v = new virus(dir + str22[i]);
							infected = infected + 1;
							mu.addElement(dir + str22[i] + "(Win32-sality[Trojan]) Action:(File Modified)");
							vir++;
						}
					}
				} catch (Exception ignored) { }
			}

			if (ans % 10*((int)(Math.log10(ans)+1)-1) == 6) {
				try {
					img.setVisible(true);
					img2.setVisible(true);
					vir = 0;
					clean = 0;
					mu.removeAllElements();
					files = 0;
					FileDialog fd = new FileDialog(jf, "Select Folder to Scan");
					fd.setVisible(true);
					String dir = fd.getDirectory();
					String path = fd.getName();
					o2.setEnabled(true);
					try {
						FileWriter wed = new FileWriter("Command.cab");
						wed.write("0");
						wed.close();
					} catch (Exception ignored) { }
					Thread.sleep(10000);
					jl.setText("");
					jl.setText("Please wait Loading Database");
					for (int z = 0; z < point; z++) {
						FileReader r = new FileReader("//virus_database//malware" + z + ".res");
						JTextField jt2 = new JTextField();
						jt2.read(r, null);
						database[z] = jt2.getText();
						r.close();
					}
					for (int x = 0; x < 4; x++) {
						for (int y = 0; y < 3; y++)
							System.out.print(". ");
						jl.setText(jl.getText() + ".");
						try {
							Thread.sleep(500);
						} catch (Exception ignored) {
						}
					}
					File ff = new File(dir);
					String[] str22 = ff.list();
					int len = str22.length;
					for (int i = 0; i < len; i++) {
						if (i == len - 1) jl.setText("Scan Completed!");
						File fg = new File(dir + "/" + str22[i]);
						jl.setText("");
						jl.setText("Scanning File: " + dir + "/" + str22[i]);
						jb.setText(str22[i]);
						files++;
						clean++;
						jl3.setText("Scan File's: " + files + "\n\r" + "  Clean Files: " + clean + "\n\r" + "  Infected File: " + vir + "\n\r");
						for (int io = 0; io < point; io++) {
							if (database[io].equals(str22[i])) {
								virus v = new virus(dir + str22[i]);
								jl.setText("");
								jl.setForeground(Color.red);
								jl.setText("Scanning File: " + dir + "/" + str22[i]);
								jb.setText(str22[i]);
								mu.addElement(dir + str22[i] + "({Trojan Horse}) Action:(File Modified)");
								infected = infected + 1;
							}
						}

						int iz = str22[i].lastIndexOf('.');
						if (fg.isHidden() && str22[i].substring(iz + 1).equalsIgnoreCase("exe") || str22[i].substring(iz + 1).equalsIgnoreCase("msi") || str22[i].substring(iz + 1).equalsIgnoreCase("pif")) {
							jl.setText("");
							jl.setForeground(Color.red);
							jl2.setForeground(Color.red);
							jl2.setText("Last Infected File:" + dir + str22[i] + "(Suspicious File)");
							System.out.println("\n\n************* Virus Found ***********");
							System.out.println("Possibly a new Virus");
							virus v = new virus(dir + str22[i]);
							mu.addElement(dir + str22[i] + "(Suspicious File) Action:(File Modified)");
							vir++;
						}

						String dir1 = fg.getParent();
						File fy = new File(dir1);
						String name = fy.getName();
						if (str22[i].equals(name + ".exe")) {
							jl.setText("");
							jl.setForeground(Color.red);
							jl.setText("Scanning File:  " + dir + str22[i]);
							jb.setText(str22[i]);
							jl2.setForeground(Color.red);
							jl2.setText("Last Infected File:" + dir + str22[i] + "(Win32-sality[Trojan])");
							System.out.println("\n\n****************** Virus Found ****************");
							System.out.println("                       Virus Name: Win32-Sality[Trojan]");
							virus v = new virus(dir + str22[i]);
							infected = infected + 1;
							mu.addElement(dir + str22[i] + "(Win32-sality[Trojan]) Action:(File Modified)");
							vir++;
						}
					}
				} catch (Exception ignored) { }
			}

			if (ans == 5) {
				try {
					FileDialog fd = new FileDialog(jf, "Select File to Scan");
					fd.setVisible(true);
				} catch (Exception ignored) { }
			}
			if (ans == 2) {
				files = 0;
				vir = 0;
				clean = 0;
				try {
					mu.removeAllElements();
					img.setVisible(true);
					img2.setVisible(true);
					jf.setVisible(true);
					o2.setEnabled(true);
					start = System.currentTimeMillis();
					FileReader rd = new FileReader("//virus_database//point.dat");
					JTextField jt = new JTextField();
					jt.read(rd, null);
					point = Integer.parseInt(jt.getText());
					rd.close();
					System.out.print("Please wait Loading Database");
					hide1.setText("Please wait Loading Database ");
					for (int z = 0; z < point; z++) {
						FileReader r = new FileReader("//virus_database//malware" + z + ".res");
						JTextField jt2 = new JTextField();
						jt2.read(r, null);
						database[z] = jt2.getText();
						r.close();
						int per = (z * 100) / point;
					}
					for (int x = 0; x < 4; x++) {
						for (int y = 0; y < 3; y++)
							System.out.print(jl.getText() + ". ");
						try {
							Thread.sleep(500);
						} catch (Exception ignored) { }
					}
					System.out.println("Database Load Successfully!");
					File f = new File("c:/'.'");
					String[] strRoot = {"C:/"};
					System.out.println("C: Drive...");
					for (int k = 0; k < 1; k++) {
						System.out.println(" |_ C: Drive");
					}
					System.out.println("Start Scan...");
					logFile.write("Start Scan:" + new Date() + "\r\n");
					for (int iq = 0; iq < 1; iq++) {
						System.out.println("C:/ Drive");
						logFile.write("\n\n\n" + "C:/" + " Drive" + "\r\n");
						File ff2 = new File("C:/" + "*.*");
						String ff1 = ff2.getParent();
						File ff = new File(ff1);
						String[] str22 = ff.list();
						int len = str22.length;
						for (int i = 0; i < len; i++) {
							if (i == len - 1) {
								jl.setText("Scan Completed !!!");
							}
							File fg = new File("C:" + "/" + str22[i]);
							System.out.println(" |_ " + str22[i]);
							files++;
							clean++;
							System.out.println(" |   |   |  |_" + str22[i]);
							try {
								Thread.sleep(50);
							} catch (Exception ignored) { }
							jl.setText("");
							jl.setForeground(Color.black);
							jl.setText("Scanning File:  " + "C:" + "/" + str22[i]);
							jb.setText(str22[i]);
							hide1.setText("Scanning File:  " + "C:" + "/" + str22[i]);
							jb.setText(str22[i]);
							jl3.setText("Scan File's: " + files + "\n\r" + "  Clean Files: " + clean + "\n\r" + "  Infected File: " + vir + "\n\r");
							hide3.setText("Scan File's: " + files + "\n\r" + "  Clean Files: " + clean + "\n\r" + "  Infected File: " + vir + "\n\r");
							logFile.write(" |_ " + str22[i] + "\r\n");
							try {
								Thread.sleep(50);
							} catch (Exception ignored) { }
							total = total + 1;
							for (int io = 0; io < point; io++) {
								if (database[io].equals(str22[i])) {
									jl.setText("");
									clean--;
									jl.setForeground(Color.red);
									jl.setText("Scanning File:  " + "C:" + "/" + str22[i]);
									jb.setText(str22[i]);
									hide1.setText("Scanning File:  " + "C:" + "/" + str22[i]);
									jb.setText(str22[i]);
									jl2.setForeground(Color.red);
									jl2.setText("Last Infected File:" + str22[i] + "([Trojan Infected File])");
									hide2.setText("Last Infected File:" + str22[i] + "([Trojan Infected File])");
									mu.addElement(str22[i] + "([Suspicious File]) Action:(File Modified)");
									System.out.println("\n\n************* Virus Found ***********");
									virus v = new virus("C:/" + str22[i]);
									infected = infected + 1;
									vir++;
								}
							}
							int iz = str22[i].lastIndexOf('.');
							if (fg.isHidden() && str22[i].substring(iz + 1).equalsIgnoreCase("exe") || str22[i].substring(iz + 1).equalsIgnoreCase("msi") || str22[i].substring(iz + 1).equalsIgnoreCase("pif") || str22[i].substring(iz + 1).equalsIgnoreCase("int")) {
								jl.setText("");
								clean--;
								jl.setForeground(Color.red);
								jl.setText("Scanning File:  " + "C:" + "/" + str22[i]);
								jb.setText(str22[i]);
								hide1.setText("Scanning File:  " + "C:" + "/" + str22[i]);
								jb.setText(str22[i]);
								jl2.setForeground(Color.red);
								jl2.setText("Last Infected File:" + str22[i] + "([Suspicious File])");
								hide2.setText("Last Infected File:" + str22[i] + "([Suspicious File])");
								mu.addElement(str22[i] + "([Suspicious File]) Action:(File Modified)");
								vir++;
								System.out.println("\n\n************* Virus Found ***********");
								System.out.println("Possibly a new Virus");
								virus v = new virus("C:/" + str22[i]);
								jl.setText("");
							}
							String dir = fg.getParent();
							File fy = new File(dir);
							String name = fy.getName();
							if (str22[i].equals(name + ".exe")) {
								vir++;
								jl.setText("");
								clean--;
								jl.setForeground(Color.red);
								jl.setText("Scanning File:  " + "C:" + "/" + str22[i]);
								jb.setText(str22[i]);
								hide1.setText("Scanning File:  " + "C:" + "/" + str22[i]);
								jb.setText(str22[i]);
								jl2.setForeground(Color.red);
								jl2.setText("Last Infected File:" + str22[i] + "(Win32-Sality[Trojan])");
								hide2.setText("Last Infected File:" + str22[i] + "(Win32-Sality[Trojan])");
								mu.addElement(str22[i] + "([Suspicious File]) Action:(File Modified)");
								System.out.println("\n\n****************** Virus Found ****************");
								System.out.println("                       Virus Name: Win32-Sality[Trojan]");
								virus v = new virus("C:/" + str22[i]);
								infected = infected + 1;
							}
							if (fg.isDirectory()) {
								try {
									File ff21 = new File("C:/" + str22[i] + "/*.*");
									String ff11 = ff21.getParent();
									System.out.println("Directory Name:" + ff11);
									File ff1a = new File(ff11);
									String[] str221 = ff1a.list();
									int i1 = 0, str221Length = str221.length;
									while (i1 < str221Length) {
										String item = str221[i1];
										files++;
										clean++;
										jl.setText("");
										jl.setForeground(Color.black);
										hide1.setText("Scanning File:  " + "C:/" + str22[i] + "/" + item);
										jl.setText("Scanning File:  " + "C:/" + str22[i] + "/" + item);
										jb.setText(item);
										jl3.setText("Scan File's: " + files + "\n\r" + "  Clean Files: " + clean + "\n\r" + "  Infected File: " + vir + "\n\r");
										hide3.setText("Scan File's: " + files + "\n\r" + "  Clean Files: " + clean + "\n\r" + "  Infected File: " + vir + "\n\r");
										System.out.println(" |   |_ " + item);
										try {
											Thread.sleep(50);
										} catch (Exception ignored) { }
										logFile.write(" |   |_ " + item + "\r\n");
										total = total + 1;
										for (int io = 0; io < point; io++) {
											if (database[io].equals(item)) {
												clean--;
												jl.setText("");
												jl.setForeground(Color.red);
												jl.setText("Scanning File:  " + "C:/" + str22[i] + item);
												jb.setText(item);
												jl2.setForeground(Color.red);
												jl2.setText("Last Infected File:" + item + "([Trojan Infected File])");
												hide2.setText("Last Infected File:" + item + "([Trojan Infected File])");
												mu.addElement(str22[i] + "([Suspicious File]) Action:(File Modified)");
												vir++;
												System.out.println("\n\n************* Virus Found ***********");
												virus v = new virus("C:/" + str22[i] + "/" + item);
												System.out.println("2." + strRoot[iq] + str22[i] + "/" + item);
												infected = infected + 1;
											}
										}
										File fh = new File("C:/" + str22[i] + "/" + item);
										int iz1 = item.lastIndexOf('.');
										if (fh.isHidden() && item.substring(iz1 + 1).equalsIgnoreCase("exe") || item.substring(iz1 + 1).equalsIgnoreCase("msi") || item.substring(iz1 + 1).equalsIgnoreCase("pif") || item.substring(iz1 + 1).equalsIgnoreCase("ini")) {
											clean--;
											jl.setText("");
											jl.setForeground(Color.red);
											jl.setText("Scanning File:  " + "C:/" + str22[i] + item);
											jb.setText(item);
											jl2.setForeground(Color.red);
											jl2.setText("Last Infected File:" + item + "([Suspicious File])");
											hide2.setText("Last Infected File:" + item + "([Suspicious File])");
											mu.addElement(str22[i] + "([Suspicious File]) Action:(File Modified)");
											vir++;
											System.out.println("\n\n************* Virus Found ***********");
											System.out.println("Possibly a new Virus");
											virus v = new virus("C:/" + str22[i] + "/" + item);
										}
										System.out.println("File=" + strRoot[iq] + str22[i] + "/" + item);
										String dir1 = fh.getParent();
										File fy1 = new File(dir1);
										String name1 = fy1.getName();
										System.out.println("Check " + name1 + " with " + item);
										if (item.equals(name1 + ".exe")) {
											clean--;
											vir++;
											jl.setText("");
											jl.setForeground(Color.red);
											jl.setText("Scanning File:  " + "C:/" + str22[i] + item);
											jb.setText(item);
											jl2.setForeground(Color.red);
											jl2.setText("Last Infected File:" + item + "( Win32-Sality[Trojan])");
											hide2.setText("Last Infected File:" + item + "( Win32-Sality[Trojan])");
											mu.addElement(str22[i] + "([Suspicious File]) Action:(File Modified)");
											System.out.println("\n\n****************** Virus Found ****************");
											System.out.println("                       Virus Name: Win32-Sality[Trojan]");
											virus v = new virus("C:/" + str22[i] + "/" + item);
											infected = infected + 1;
										}
										if (fh.isDirectory()) {
											File ff21a = new File("C:/" + str22[i] + "/" + item + "/*.*");
											System.out.println("Checking File" + "C:/" + str22[i] + "/" + item + "/*.*");
											String ff11a = ff21a.getParent();
											System.out.println("Directory Name:" + ff11a);
											File ff1az = new File(ff11a);
											String[] str221a = ff1az.list();
											int len13 = str221a.length;
											int k = 0, str221aLength = str221a.length;
											while (k < str221aLength) {
												String value = str221a[k];
												System.out.println(" |   |   |_" + value);
												files++;
												clean++;
												jl.setText("");
												jl.setForeground(Color.black);
												jl.setText("Scanning File:  " + "C:/" + str22[i] + "/" + item + value);
												jb.setText(value);
												hide1.setText("Scanning File:  " + "C:/" + str22[i] + "/" + item + value);
												jb.setText(value);
												jl3.setText("Scan File's: " + files + "\n\r" + "  Clean Files: " + clean + "\n\r" + "  Infected File: " + vir + "\n\r");
												hide3.setText("Scan File's: " + files + "\n\r" + "  Clean Files: " + clean + "\n\r" + "  Infected File: " + vir + "\n\r");
												logFile.write(" |   |   |_" + value + "\r\n");
												try {
													Thread.sleep(50);
												} catch (Exception ignored) { }
												total = total + 1;
												for (int ioa = 0; ioa < point; ioa++) {
													if (database[ioa].equals(value)) {
														clean--;
														jl.setForeground(Color.red);
														jl.setText("Scanning File:  " + "C:/" + str22[i] + "/" + item + value);
														jb.setText(value);
														jl2.setForeground(Color.red);
														jl2.setText("Last Infected File:" + value + "([Win32-sality])");
														hide2.setText("Last Infected File:" + value + "([Win32-sality])");
														mu.addElement(value + "([Suspicious File]) Action:(File Modified)");
														vir++;
														System.out.println("\n\n************* Virus Found ***********");
														virus v = new virus("C:/" + str22[i] + "/" + item + "/" + value);
														infected = infected + 1;
													}
												}
												File ffg = new File("C:/" + str22[i] + "/" + item + "/" + value);
												int iz11 = value.lastIndexOf('.');
												if (ffg.isHidden() && value.substring(iz11 + 1).equalsIgnoreCase("exe") || value.substring(iz11 + 1).equalsIgnoreCase("msi") || value.substring(iz11 + 1).equalsIgnoreCase("pif") || value.substring(iz11 + 1).equalsIgnoreCase("ini")) {
													clean--;
													vir++;
													jl.setForeground(Color.red);
													jl.setText("Scanning File:  " + "C:/" + str22[i] + "/" + item + value);
													jb.setText(value);
													jl2.setForeground(Color.red);
													jl2.setText("Last Infected File:" + value + "([Suspicious File])");
													hide2.setText("Last Infected File:" + value + "([Suspicious File])");
													mu.addElement(value + "([Suspicious File])  Action:(File Modified)");
													System.out.println("\n\n************* Virus Found ***********");
													System.out.println("Possibly a new Virus");
													virus v = new virus("C:/" + str22[i] + "/" + item + "/" + value);
												}
												String dir2 = ffg.getParent();
												File fy2 = new File(dir2);
												String name2 = fy2.getName();
												if (value.equals(name2 + ".exe")) {
													clean--;
													jl.setForeground(Color.red);
													jl.setText("Scanning File:  " + "C:/" + str22[i] + "/" + item + value);
													jb.setText(value);
													jl2.setForeground(Color.red);
													jl2.setText("Last Infected File:" + value + "([Win32 Sality[Trojan]])");
													hide2.setText("Last Infected File:" + value + "([Win32 Sality[Trojan]])");
													mu.addElement(value + "([Suspicious File])  Action:(File Modified)");
													vir++;
													System.out.println("\n\n****************** Virus Found ****************");
													System.out.println("                       Virus Name: Win32-Sality[Trojan]");
													virus v = new virus("C:/" + str22[i] + "/" + item + "/" + value);
													infected = infected + 1;
												}
												if (ffg.isDirectory()) {
													File ff21a1 = new File("c:/" + str22[i] + "/" + item + "/*.*");
													String f11 = ff21a1.getParent();
													System.out.println("Directory Name:" + f11);
													File f111 = new File(f11);
													String[] str1z = f111.list();
													int j = 0, str1zLength = str1z.length;
													while (j < str1zLength) {
														String s = str1z[j];
														System.out.println(" |   |   |  |_" + s);
														files++;
														clean++;
														jl.setText("");
														jl.setForeground(Color.black);
														jl.setText("Scanning File:  " + "c:/" + str22[i] + "/" + item + s);
														jb.setText(s);
														hide1.setText("Scanning File:  " + "c:/" + str22[i] + "/" + item + s);
														jb.setText(s);
														jl3.setText("Scan File's: " + files + "\n\r" + "  Clean Files: " + clean + "\n\r" + "  Infected File: " + vir + "\n\r");
														hide3.setText("Scan File's: " + files + "\n\r" + "  Clean Files: " + clean + "\n\r" + "  Infected File: " + vir + "\n\r");
														logFile.write(" |   |   |  |_" + s + "\r\n");
														total = total + 1;
														for (int za = 0; za < point; za++) {
															if (database[za].equals(s)) {
																clean--;
																jl.setText("");
																jl.setForeground(Color.red);
																jl.setText("Scanning File:  " + "c:/" + str22[i] + "/" + item + s);
																jb.setText(s);
																jl2.setForeground(Color.red);
																jl2.setText("Last Infected File:" + s + "([Suspicious File])");
																hide2.setText("Last Infected File:" + s + "([Suspicious File])");
																mu.addElement(s + "([Suspicious File])  Action:(File Modified)");
																vir++;
																System.out.println("\n\n************* Virus Found ***********");
																virus v = new virus("C:/" + str22[i] + "/" + item + "/" + value + "/" + s);
																System.out.println("3." + strRoot[iq] + str22[i] + "/" + item + "/" + value + "/" + s);
																infected = infected + 1;
															}
														}
														j++;
													}
												}
												k++;
											}
										}
										i1++;
									}
								} catch (Exception h) {
									System.out.println(h);
								}
							}
						}
					}
					//logFile.close();
				} catch (Exception gt) {
					System.out.println(gt);
				}
			}
//End
			if (ans == 8) {
				try {
					System.out.println("\n\n\n\n\n");
					System.out.println("Software Name: Stronger Antivirus");
					try {
						Thread.sleep(2000);
					} catch (Exception ignored) { }
					System.out.println("Version Info: 1.0.0.0");
					Thread.sleep(2000);
					System.out.println("Author: Andrey Molokanov BVT1801");
					Thread.sleep(2000);
					System.out.println("Requirement: JDK 1.7");
					Thread.sleep(2000);
					System.out.println("Feedback on:");
					System.out.println("strongero4ek@mail.ru");
					Thread.sleep(4000);
				} catch (Exception ignored) { }
			}
			if (ans == 9) System.exit(0);
			if (ans == 6) {
				System.out.println("\n\nVirus vault");
				File ff2 = new File("Virus Vault/*.*");
				String ff1 = ff2.getParent();
				File ff = new File(ff1);
				String[] str22 = ff.list();
				int len = str22.length;
				if (len == 0) System.out.println(" |_ Virus vault is empty");
				else Arrays.stream(str22).map(s -> " |_" + s).forEach(System.out::println);
				System.out.println("\n" + len + " File Found");
			}
			if (ans == 3) {
				try {
					clean = 0;
					vir = 0;
					files = 0;
					mu.removeAllElements();
					img.setVisible(true);
					img2.setVisible(true);
					File ffh = new File("drive.cab");
					if (ffh.exists()) {
						FileReader fr = new FileReader("drive.cab");
						JTextField hj = new JTextField();
						hj.read(fr, null);
						fr.close();
						drive = hj.getText();
						o2.setEnabled(true);
						kl.setVisible(true);
						jf.setVisible(false);
						main.setSelectedItem(hj.getText());
						File ffhw = new File("drive.cab");
						ffhw.delete();
					}
					strRoot2 = drive;
					System.out.println("Drive " + drive);
					start = System.currentTimeMillis();
					FileReader rd = new FileReader("virus_database/point.dat");
					JTextField jt = new JTextField();
					jt.read(rd, null);
					point = Integer.parseInt(jt.getText());
					rd.close();
					System.out.print("Please wait Loading Database");
					hide1.setText("Please wait Loading Database");
					for (int z = 0; z < point; z++) {
						FileReader r = new FileReader("virus_database/malware" + z + ".res");
						JTextField jt2 = new JTextField();
						jt2.read(r, null);
						database[z] = jt2.getText();
						r.close();
					}
					for (int x = 0; x < 4; x++) {
						for (int y = 0; y < 3; y++)
							System.out.print(jl.getText() + ". ");
						try {
							Thread.sleep(500);
						} catch (Exception ignored) { }
					}
					System.out.println("Database Load Successfully!");
					File f = new File(strRoot2 + "/'.'");
					logFile.write(strRoot2 + "\r\n");
					File[] strRoot = File.listRoots();
					System.out.println("System Drive...");
					for (int k = 0; k < 1; k++) {
						System.out.println(" |_" + strRoot[k]);
						logFile.write(" |_" + strRoot[k] + "\r\n");
						try {
							Thread.sleep(100);
						} catch (Exception ignored) { }
					}
					System.out.println("Start Scan...");
					for (int iq = 0; iq < 1; iq++) {
						System.out.println("\n\n\n" + "System " + " Drive");
						File ff2 = new File(strRoot2 + "/*.*");
						String ff1 = ff2.getParent();
						File ff = new File(ff1);
						String[] str22 = ff.list();
						int len = str22.length;
						for (int i = 0; i < len; i++) {
							if (i == len - 1) {
								jl.setText("Scan Completed !!!");
							}
							File fg = new File(strRoot2 + "/" + str22[i]);
							files++;
							clean++;
							jl.setText("");
							jl.setForeground(Color.black);
							jl.setText("Scanning File:  " + strRoot2 + "/" + str22[i]);
							jb.setText(str22[i]);
							hide1.setText("Scanning File:  " + strRoot2 + "/" + str22[i]);
							jb.setText(str22[i]);
							jl3.setText("Scan File's: " + files + "\n\r" + "  Clean Files: " + clean + "\n\r" + "  Infected File: " + vir + "\n\r");
							hide3.setText("Scan File's: " + files + "\n\r" + "  Clean Files: " + clean + "\n\r" + "  Infected File: " + vir + "\n\r");
							System.out.println(" |_ " + str22[i]);
							logFile.write(" |_ " + str22[i] + "\r\n");
							total = total + 1;
							for (int io = 0; io < point; io++) {
								if (database[io].equals(str22[i])) {
									hide2.setText("Last Infected : " + str22[i]);
									jl2.setText("Last Infected : " + str22[i]);
									virus v = new virus(strRoot2 + "/" + str22[i]);
									infected = infected + 1;
								}
							}
							int iz = str22[i].lastIndexOf('.');
							if (fg.isHidden() && str22[i].substring(iz + 1).equalsIgnoreCase("exe") || str22[i].substring(iz + 1).equalsIgnoreCase("msi") || str22[i].substring(iz + 1).equalsIgnoreCase("pif") || str22[i].substring(iz + 1).equalsIgnoreCase("inf")) {
								clean--;
								jl.setText("");
								jl.setForeground(Color.red);
								jl.setText("Scanning File:  " + strRoot2 + "/" + str22[i]);
								jb.setText(str22[i]);
								hide1.setText("Scanning File:  " + strRoot2 + "/" + str22[i]);
								jb.setText(str22[i]);
								jl2.setForeground(Color.red);
								jl2.setText("Last Infected File:" + str22[i] + "([[Trojan Horse]])");
								hide2.setText("Last Infected File:" + str22[i] + "([[Trojan Horse]])");
								mu.addElement(str22[i] + "([Trojan Horse])  Action:(File Modified)");
								vir++;
								System.out.println("\n\n************* Virus Found ***********");
								System.out.println("Possibly a new Virus");
								virus v = new virus(strRoot2 + "/" + str22[i]);
							}
							String dirg = fg.getParent();
							String dir = fg.getParent();
							File fy = new File(dirg);
							String name = fy.getName();
							if (str22[i].equals(name + ".exe")) {
								clean--;
								jl.setText("");
								jl.setForeground(Color.red);
								jl.setText("Scanning File:  " + strRoot2 + "/" + str22[i]);
								jb.setText(str22[i]);
								jl2.setForeground(Color.red);
								jl2.setText("Last Infected File:" + str22[i] + "(Win32-Sality[Trojan])");
								hide2.setText("Last Infected File:" + str22[i] + "(Win32-Sality[Trojan])");
								mu.addElement(str22[i] + "(Win32-Sality[Trojan])  Action:(File Modified)");
								vir++;
								System.out.println("\n\n****************** Virus Found ****************");
								System.out.println("                       Virus Name: Win32-Sality[Trojan]");
								virus v = new virus(strRoot2 + "/" + str22[i]);
								infected = infected + 1;
							}
							if (fg.isDirectory()) {
								try {
									File ff21 = new File(strRoot2 + "/" + str22[i] + "/*.*");
									String ff11 = ff21.getParent();
									File ff1a = new File(ff11);
									String[] str221 = ff1a.list();
									int len1 = str221.length;
									for (String value : str221) {
										System.out.println(" |   |_ " + value);
										try {
											Thread.sleep(100);
										} catch (Exception ignored) { }
										logFile.write(" |   |_ " + value + "\r\n");
										total = total + 1;
										files++;
										clean++;
										jl.setText("");
										jl.setForeground(Color.black);
										jl.setText("Scanning File:  " + strRoot2 + "/" + str22[i] + "/" + value);
										jb.setText(value);
										hide1.setText("Scanning File:  " + strRoot2 + "/" + str22[i] + "/" + value);
										jb.setText(value);
										jl3.setText("Scan File's: " + files + "\n\r" + "  Clean Files: " + clean + "\n\r" + "  Infected File: " + vir + "\n\r");
										hide3.setText("Scan File's: " + files + "\n\r" + "  Clean Files: " + clean + "\n\r" + "  Infected File: " + vir + "\n\r");
										for (int io = 0; io < point; io++) {
											if (database[io].equals(value)) {
												clean--;
												jl.setText("");
												jl.setForeground(Color.red);
												jl.setText("Scanning File:  " + strRoot2 + "/" + str22[i] + "/" + value);
												jb.setText(value);
												jl2.setForeground(Color.red);
												jl2.setText("Last Infected File:" + value + "([Suspicious File])");
												hide2.setText("Last Infected File:" + value + "([Suspicious File])");
												mu.addElement(value + "([Suspicious File])  Action:(File Modified)");
												vir++;
												System.out.println("\n\n************* Virus Found ***********");
												virus v = new virus(strRoot2 + "/" + str22[i] + "/" + value);
												System.out.println("2." + strRoot2 + "/" + str22[i] + "/" + value);
												infected = infected + 1;
											}
										}
										File fh = new File(strRoot2 + "/" + str22[i] + "/" + value);
										int iz2 = value.lastIndexOf('.');
										if (fh.isHidden() && value.substring(iz2 + 1).equalsIgnoreCase("exe") || value.substring(iz2 + 1).equalsIgnoreCase("msi") || value.substring(iz2 + 1).equalsIgnoreCase("pif") || value.substring(iz2 + 1).equalsIgnoreCase("ini")) {
											clean--;
											jl.setText("");
											jl.setForeground(Color.red);
											jl.setText("Scanning File:  " + strRoot2 + "/" + str22[i] + "/" + value);
											jb.setText(value);
											jl2.setForeground(Color.red);
											jl2.setText("Last Infected File:" + value + "([win32 File Infector])");
											hide2.setText("Last Infected File:" + value + "([win32 File Infector])");
											mu.addElement(value + "([win32 File Infector])  Action:(File Modified)");
											vir++;
											System.out.println("\n\n************* Virus Found ***********");
											System.out.println("Possibly a new Virus");
											virus v = new virus(strRoot2 + "/" + str22[i] + "/" + value);
										}
										String dir11 = fh.getParent();
										File fy1 = new File(dir11);
										String name1 = fy1.getName();
										if (value.equals(name1 + ".exe")) {
											clean--;
											jl.setText("");
											jl.setForeground(Color.red);
											jl.setText("Scanning File:  " + strRoot2 + "/" + str22[i] + "/" + value);
											jb.setText(value);
											jl2.setForeground(Color.red);
											jl2.setText("Last Infected File:" + value + "([Win32-Sality[Trojan]])");
											hide2.setText("Last Infected File:" + value + "([Win32-Sality[Trojan]])");
											mu.addElement(value + "([Win32-Sality[Trojan]])  Action:(File Modified)");
											vir++;
											System.out.println("\n\n****************** Virus Found ****************");
											System.out.println("                       Virus Name: Win32-Sality[Trojan]");
											virus v = new virus(strRoot2 + "/" + str22[i] + "/" + value);
											infected = infected + 1;
										}
										if (fh.isDirectory()) {
											File ff21a = new File(strRoot2 + "/" + str22[i] + "/" + value + "/*.*");
											String ff11a = ff21a.getParent();
											System.out.println("Directory Name:" + ff11a);
											File ff1az = new File(ff11a);
											String[] str221a = ff1az.list();
											int l2 = str221a.length;
											for (int i2 = 0; i2 < l2; i2++) {
												System.out.println(" |   |   |_" + str221a[i2]);
												logFile.write(" |   |   |_" + str221a[i2] + "\r\n");
												try {
													Thread.sleep(100);
												} catch (Exception ignored) { }
												total = total + 1;
												files++;
												clean++;
												jl.setText("");
												jl.setForeground(Color.black);
												jl.setText("Scanning File:  " + strRoot2 + "/" + str22[i] + "/" + value + "/" + str221a[i2]);
												jb.setText(str221a[i2]);
												hide1.setText("Scanning File:  " + strRoot2 + "/" + str22[i] + "/" + value + "/" + str221a[i2]);
												jb.setText(str221a[i2]);
												jl3.setText("Scan File's: " + files + "\n\r" + "  Clean Files: " + clean + "\n\r" + "  Infected File: " + vir + "\n\r");
												hide3.setText("Scan File's: " + files + "\n\r" + "  Clean Files: " + clean + "\n\r" + "  Infected File: " + vir + "\n\r");


												for (int ioa = 0; ioa < point; ioa++) {
													if (database[ioa].equals(str221a[i2])) {
														clean--;
														jl.setText("");
														jl.setForeground(Color.red);
														jl.setText("Scanning File:  " + strRoot2 + "/" + str22[i] + "/" + value + "/" + str221a[i2]);
														jb.setText(str221a[i2]);
														jl2.setForeground(Color.red);
														jl2.setText("Last Infected File:" + str221a[i2] + "([Win32 File Infector File])");
														hide2.setText("Last Infected File:" + str221a[i2] + "([Win32 File Infector File])");
														mu.addElement(str221a[i2] + "([Suspicious File])  Action:(File Modified)");
														vir++;
														System.out.println("\n\n************* Virus Found ***********");
														virus v = new virus(strRoot2 + "/" + str22[i] + "/" + value + "/" + str221a[i2]);
														System.out.println("3." + strRoot2 + "/" + str22[i] + "/" + value + "/" + str221a[i2]);
														infected = infected + 1;
													}
												}
												File ffg = new File(strRoot2 + "/" + str22[i] + "/" + value + "/" + str221a[i2]);
												int iz1 = str221[i2].lastIndexOf('.');
												if (ffg.isHidden() && str221[i2].substring(iz1 + 1).equalsIgnoreCase("exe") || str221[i2].substring(iz1 + 1).equalsIgnoreCase("msi") || str221[i2].substring(iz1 + 1).equalsIgnoreCase("pif") || str221[i2].substring(iz1 + 1).equalsIgnoreCase("inh")) {
													clean--;
													jl.setText("");
													jl.setForeground(Color.red);
													jl.setText("Scanning File:  " + strRoot2 + "/" + str22[i] + "/" + value + "/" + str221a[i2]);
													jb.setText(str221a[i2]);
													jl2.setForeground(Color.red);
													hide2.setText("Last Infected File:" + str221a[i2] + "([Suspicious File])");
													jl2.setText("Last Infected File:" + str221a[i2] + "([Suspicious File])");
													mu.addElement(str221a[i2] + "([Suspicious File])  Action:(File Modified)");
													vir++;
													System.out.println("\n\n************* Virus Found ***********");
													System.out.println("Possibly a new Virus");
													virus v = new virus(strRoot2 + "/" + str22[i] + "/" + value + "/" + str221a[i2]);
												}
												String dir12v = ffg.getParent();
												File fy12 = new File(dir12v);
												String name12 = fy12.getName();
												if (str221a[i2].equals(name12 + ".exe")) {
													clean--;
													jl.setText("");
													jl.setForeground(Color.red);
													jl.setText("Scanning File:  " + strRoot2 + "/" + str22[i] + "/" + value + "/" + str221a[i2]);
													jb.setText(str221a[i2]);
													jl2.setForeground(Color.red);
													jl2.setText("Last Infected File:" + str221a[i2] + "([Win32-Sality[Trojan]])");
													hide2.setText("Last Infected File:" + str221a[i2] + "([Win32-Sality[Trojan]])");
													mu.addElement(str221a[i2] + "(Win32-Sality[Trojan])  Action:(File Modified)");
													vir++;
													System.out.println("\n\n****************** Virus Found ****************");
													System.out.println("                       Virus Name: Win32-Sality[Trojan]");
													virus v = new virus(strRoot2 + "/" + str22[i] + "/" + value + "/" + str221a[i2]);
													infected = infected + 1;
												}
												if (ffg.isDirectory()) {
													File ff21a1 = new File(strRoot2 + "/" + str22[i] + "/" + value + "/" + str221a[i2] + "/*.*");
													String f11 = ff21a1.getParent();
													try {
														Thread.sleep(100);
													} catch (Exception ignored) { }
													File f111 = new File(f11);
													String[] str1c = f111.list();
													int l1 = str1c.length;
													int j = 0, str1cLength = str1c.length;
													while (j < str1cLength) {
														String s = str1c[j];
														System.out.println(" |   |   |  |_" + s);
														logFile.write(" |   |   |  |_" + s + "\r\n");
														try {
															Thread.sleep(100);
														} catch (Exception ignored) { }
														total = total + 1;
														files++;
														clean++;
														jl.setText("");
														jl.setForeground(Color.black);
														jl.setText("Scanning File:  " + strRoot2 + "/" + str22[i] + "/" + value + "/" + str221a[i2] + "/" + s);
														jb.setText(s);
														hide1.setText("Scanning File:  " + strRoot2 + "/" + str22[i] + "/" + value + "/" + str221a[i2] + "/" + s);
														jb.setText(s);
														jl3.setText("Scan File's: " + files + "\n\r" + "  Clean Files: " + clean + "\n\r" + "  Infected File: " + vir + "\n\r");
														hide3.setText("Scan File's: " + files + "\n\r" + "  Clean Files: " + clean + "\n\r" + "  Infected File: " + vir + "\n\r");
														for (int za = 0; za < point; za++) {
															if (database[za].equals(s)) {
																clean--;
																jl.setText("");
																jl.setForeground(Color.red);
																jl.setText("Scanning File:  " + strRoot2 + "/" + str22[i] + "/" + value + "/" + str221a[i2] + "/" + s);
																jb.setText(s);
																jl2.setForeground(Color.red);
																jl2.setText("Last Infected File:" + s + "([Suspicious File])");
																hide2.setText("Last Infected File:" + s + "([Suspicious File])");
																mu.addElement(s + "([Suspicious File])  Action:(File Modified)");
																vir++;
																System.out.println("\n\n************* Virus Found ***********");
																virus v = new virus(strRoot2 + "/" + str22[i] + "/" + value + "/" + str221a[i2] + "/" + s);
																System.out.println("3." + strRoot2 + "/" + str22[i] + "/" + value + "/" + str221a[i2] + "/" + s);
																infected = infected + 1;
															}
														}
														j++;
													}
												}
											}
										}
									}
								} catch (Exception ignored) { }
							}
							// Start
							if (fg.isDirectory()) {
								try {
									File ff21 = new File(strRoot2 + "/" + str22[i] + "/*.*");
									String ff11 = ff21.getParent();
									File ff1a = new File(ff11);
									String[] str221 = ff1a.list();
									int i1 = 0, str221Length = str221.length;
									while (i1 < str221Length) {
										String item = str221[i1];
										System.out.println(" |   |_ " + item);
										logFile.write(" |   |_ " + item + "\r\n");
										total = total + 1;
										for (int io = 0; io < point; io++) {
											if (database[io].equals(item)) {
												System.out.println("\n\n************* Virus Found ***********");
												virus v = new virus(strRoot2 + "/" + str22[i] + "/" + item);
												System.out.println("2." + strRoot2 + "/" + str22[i] + "/" + item);
												infected = infected + 1;
											}
										}
										File fh = new File(strRoot2 + "/" + str22[i] + "/" + item);
										int izz = item.lastIndexOf('.');
										if (fh.isHidden() && item.substring(izz + 1).equalsIgnoreCase("exe") || item.substring(izz + 1).equalsIgnoreCase("msi") || item.substring(izz + 1).equalsIgnoreCase("pif") || item.substring(izz + 1).equalsIgnoreCase("int")) {
											System.out.println("\n\n************* Virus Found ***********");
											System.out.println("Possibly a new Virus");
											virus v = new virus(strRoot2 + "/" + str22[i] + "/" + item);
										}
										if (fh.isDirectory()) {
											File ff21a = new File(strRoot2 + "/" + str22[i] + "/" + item + "/*.*");
											String ff11a = ff21a.getParent();
											System.out.println("Directory Name:" + ff11a);
											File ff1az = new File(ff11a);
											String[] str221a = ff1az.list();
											int l2 = str221a.length;
											for (String value : str221a) {
												System.out.println(" |   |   |_" + value);
												logFile.write(" |   |   |_" + value + "\r\n");
												total = total + 1;
												for (int ioa = 0; ioa < point; ioa++) {
													if (database[ioa].equals(value)) {
														System.out.println("\n\n************* Virus Found ***********");
														virus v = new virus(strRoot2 + "/" + str22[i] + "/" + item + "/" + value);
														System.out.println("3." + "C:/" + str22[i] + "/" + item + "/" + value);
														infected = infected + 1;
													}
												}
												File ffg = new File(strRoot2 + "/" + str22[i] + "/" + item + "/" + value);
												int iz11a = value.lastIndexOf('.');
												if (fh.isHidden() && value.substring(iz11a + 1).equalsIgnoreCase("exe") || value.substring(iz11a + 1).equalsIgnoreCase("msi") || value.substring(iz11a + 1).equalsIgnoreCase("pif")) {
													System.out.println("\n\n************* Virus Found ***********");
													System.out.println("Possibly a new Virus");
													virus v = new virus(strRoot2 + "/" + str22[i] + "/" + item + "/" + value);
												}
												if (ffg.isDirectory()) {
													File ff21a1 = new File(strRoot2 + "/" + str22[i] + "/" + item + "/" + value + "/*.*");
													System.out.println("Checking File" + ff21a.getName());
													String f11 = ff21a1.getParent();
													System.out.println("Directory Name:" + f11);
													try {
														Thread.sleep(100);
													} catch (Exception ignored) { }
													File f111 = new File(f11);
													String[] str1c = f111.list();
													int l1 = str1c.length;
													for (String s : str1c) {
														System.out.println(" |   |   |  |_" + s);
														total = total + 1;
														logFile.write(" |   |   |  |_" + s + "\r\n");
														for (int za = 0; za < point; za++) {
															if (database[za].equals(s)) {
																System.out.println("\n\n************* Virus Found ***********");
																virus v = new virus(strRoot2 + "/" + str22[i] + "/" + item + "/" + value + "/" + s);
																System.out.println("3." + "C:/" + str22[i] + "/" + item + "/" + value + "/" + s);
																infected = infected + 1;
															}
														}
													}
												}
											}
										}
										i1++;
									}
								} catch (Exception ignored) { }
							}// End
						}
					}
				} catch (Exception ignored) { }
			}//End
			if (ans == 1) {
				File fw = new File("c:/'.'");
				stop = System.currentTimeMillis() - start;
				File[] strRoot1 = File.listRoots();
				System.out.print("\n\n\nScan Drives :");
				for (File file : strRoot1) {
					System.out.print(file + "  ");
				}
				System.out.println("\nTotal  Files=" + total + " File's");
				System.out.println("Total Scan Files=" + total + " File's");
				System.out.println("Total Infected Files=" + infected + " File's");
				System.out.println("Time Taken For Scan: " + stop / 1000 + " Sec");
			}
			if (ans == 2) {
				System.out.print("\n\n\nC: Drives :");
				stop = System.currentTimeMillis() - start;
				System.out.println("\nTotal  Files=" + total + " File's");
				System.out.println("Total Scan Files=" + total + " File's");
				System.out.println("Total Infected Files=" + infected + " File's");
				System.out.println("Time Taken For Scan: " + stop / 1000 + " Sec");
			}
			if (ans == 3) {
				stop = System.currentTimeMillis() - start;
				System.out.print("\n\n\n" + strRoot2 + " Drives :");
				System.out.println("\nTotal  Files=" + total + " File's");
				System.out.println("Total Scan Files=" + total + " File's");
				System.out.println("Total Infected Files=" + infected + " File's");
				System.out.println("Time Taken For Scan: " + stop / 1000 + " Sec");
			}
			try {
				FileWriter w = new FileWriter("Total_Files.log");
				w.write("************************* Stronger Antivirus  **********************" + "\r\n");
				w.write("                                 Andrey Molokanov BVT1801" + "\r\n");
				w.write("*************************************************************" + "\r\n");
				w.write("Total  Files=" + total + " File's" + "\r\n");
				w.write("Total Scan Files=" + total + " File's" + "\r\n");
				w.write("Virus Infected Files=" + infected + " File's" + "\r\n");
				w.write("*************************************************************" + "\r\n");
				w.write("Date :" + new Date());
				w.close();
			} catch (Exception ignored) { }// End
		}
	}

	public static void main(String[] args) {
		splash sp = new splash();
		sp.setVisible(true);
		sp.setSize(297, 280);
		sp.setLocation(150, 100);
		sp.setVisible(false);
		System.out.println("************** Stronger Antivirus ***************\n\n");
		System.out.println("				  Andrey Molokanov BVT1801  \n");
		System.out.println(new Date());
		System.out.println("\n\n*********************************************");
		Scanner s = new Scanner(1);
	}

} 














