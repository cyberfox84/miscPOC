package glasspane;

/**
 *
 * @author  Andres Toussaint
 */
public class GlassPane extends javax.swing.JFrame {

	/** Creates new form NewJFrame */
	public GlassPane() {
		initComponents();
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	private void initComponents() {
		svgPanel = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		btnPanel = new javax.swing.JPanel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jSeparator1 = new javax.swing.JSeparator();
		jLabel2 = new javax.swing.JLabel();
		target = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		svgPanel.setMaximumSize(new java.awt.Dimension(400, 400));
		svgPanel.setMinimumSize(new java.awt.Dimension(400, 400));
		svgPanel.setPreferredSize(new java.awt.Dimension(400, 400));
		getContentPane().add(svgPanel, java.awt.BorderLayout.CENTER);

		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setText("SVG Glass pane example");
		getContentPane().add(jLabel1, java.awt.BorderLayout.NORTH);

		btnPanel.setLayout(new javax.swing.BoxLayout(btnPanel, javax.swing.BoxLayout.Y_AXIS));

		jButton1.setText("create SVG");
		jButton1.addActionListener(new java.awt.event.ActionListener() {

			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		btnPanel.add(jButton1);

		jButton2.setText("Add Glasspane");
		jButton2.setEnabled(false);
		jButton2.addActionListener(new java.awt.event.ActionListener() {

			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		btnPanel.add(jButton2);

		jButton3.setText("add listeners");
		jButton3.setEnabled(false);
		jButton3.addActionListener(new java.awt.event.ActionListener() {

			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		btnPanel.add(jButton3);

		jButton4.setText("reset");
		jButton4.setEnabled(false);
		jButton4.addActionListener(new java.awt.event.ActionListener() {

			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		btnPanel.add(jButton4);

		jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
		jSeparator1.setMaximumSize(new java.awt.Dimension(20, 40));
		jSeparator1.setPreferredSize(new java.awt.Dimension(20, 40));
		btnPanel.add(jSeparator1);

		jLabel2.setFont(new java.awt.Font("MS Sans Serif", 1, 12));
		jLabel2.setText("Target:");
		jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		btnPanel.add(jLabel2);

		target.setFont(new java.awt.Font("Arial Narrow", 0, 10));
		target.setText("none");
		target.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		btnPanel.add(target);

		getContentPane().add(btnPanel, java.awt.BorderLayout.EAST);

		pack();
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		svgPanel.removeAll();
		jButton4.setEnabled(false);
		jButton1.setEnabled(true);
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		example.registerListeners(target);
		jButton3.setEnabled(false);
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		example.addGlassPane();
		jButton3.setEnabled(true);
		jButton2.setEnabled(false);
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		example = new SvgGlassPaneExample(svgPanel);
		jButton2.setEnabled(true);
		jButton4.setEnabled(true);
		jButton1.setEnabled(false);
		this.validate();
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				new GlassPane().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JPanel		btnPanel;
	private javax.swing.JButton		jButton1;
	private javax.swing.JButton		jButton2;
	private javax.swing.JButton		jButton3;
	private javax.swing.JButton		jButton4;
	private javax.swing.JLabel		jLabel1;
	private javax.swing.JLabel		jLabel2;
	private javax.swing.JSeparator	jSeparator1;
	private javax.swing.JPanel		svgPanel;
	private javax.swing.JLabel		target;
	// End of variables declaration

	private SvgGlassPaneExample		example;
}