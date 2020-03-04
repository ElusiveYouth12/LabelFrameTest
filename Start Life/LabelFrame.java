import java.awt.FlowLayout; //especifica como os componentes s�o organizados
import javax.swing.JFrame; // fornece recursos b�sicos de janela
import javax.swing.JLabel; // exibe texto e imagens
import javax.swing.SwingConstants; / constantes comuns utilizadas com Swing
import javax.swing.Icon; // interface utilizada para manipular imagens
import javax.swing.ImageIcon; // carrega imagens

public class LabelFrame extends JFrame{
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;

	public LabelFrame(){
		super( "Testing JLabel" );
		setLayout( new FlowLayout() );
		label1 = new JLabel( "Label with text" );
		label1.setToolTipText ("This is label1");
		add (label1);

		Icon bug = new ImageIcon( getClass().getResource( "bug1.png"));
		label2 - new JLabel( "Label with text and icon", bug.SwingConstants.LEFT);
		label2.setTooTipText( "This is label2");
		add (label2);

		label3 = new JLabel1();
		label3.setText( "Label with icon and text at bottom");
		label3.setIcon (bug);
		label3.setHorizontalTextPosition(SwingConstants.CENTER);
		label3.setVerticalTextPosition(SwingConstants.BOTTOM);
		label3.setToolTipText("This is label3");
		add (label3);
	}
}

		