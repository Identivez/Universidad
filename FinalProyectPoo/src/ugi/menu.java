/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ugi;

import cjb.ci.CtrlInterfaz;
import cjb.ci.Mensajes;
import cjb.ci.Validaciones;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import menu.Alumnos;
import menu.Datos;
import menu.HistorialClinico;
import menu.Menu;
import menu.Personal;
import poo.ManipulacionArchivos;
import java.text.ParseException;


/**
 *
 * @author ghael
 */
public class menu extends javax.swing.JFrame
{

    int xMouse, yMouse;
    public static Datos a[] = null;
    public static HistorialClinico H[][] = null;
    public static Datos p[] = null;

    public menu()
    {
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        VerMas1.setText("<html>Ver más</html>");
        VerMas2.setText("<html>Ver más</html>");
        VerMas3.setText("<html>Ver más</html>");
        VerMas4.setText("<html>Ver más</html>");

    }

    //Icono del Jframe
    @Override
    public Image getIconImage()
    {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/logo.png"));

        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMenu = new javax.swing.JPanel();
        PanelIzq = new javax.swing.JPanel();
        Inicio = new javax.swing.JPanel();
        TxtInicio = new javax.swing.JLabel();
        Funcion = new javax.swing.JPanel();
        TxtFuncion = new javax.swing.JLabel();
        Alumnos = new javax.swing.JPanel();
        TxtAlumnos = new javax.swing.JLabel();
        Personal = new javax.swing.JPanel();
        TxtPersonal = new javax.swing.JLabel();
        Enfermeria = new javax.swing.JPanel();
        TxtEnfermeria = new javax.swing.JLabel();
        TextoUNIVERSIDAD = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        PanelSuperior = new javax.swing.JPanel();
        TxtInicio2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        CierreCompleto = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TablaOpciones = new javax.swing.JTabbedPane();
        PanelInicio = new javax.swing.JPanel();
        Bienvenidos = new javax.swing.JLabel();
        CuadroFuncion = new javax.swing.JPanel();
        TxtFuncion2 = new javax.swing.JLabel();
        PanelVerMas = new javax.swing.JPanel();
        VerMas1 = new javax.swing.JLabel();
        CuadroAlumnos = new javax.swing.JPanel();
        TxtAlumnos2 = new javax.swing.JLabel();
        PanelVerMas2 = new javax.swing.JPanel();
        VerMas2 = new javax.swing.JLabel();
        CuadroPersonal = new javax.swing.JPanel();
        TxtPersonal2 = new javax.swing.JLabel();
        PanelVerMas3 = new javax.swing.JPanel();
        VerMas3 = new javax.swing.JLabel();
        CuadrosEnfermeria = new javax.swing.JPanel();
        TxtEnfermeria2 = new javax.swing.JLabel();
        PanelVerMas4 = new javax.swing.JPanel();
        VerMas4 = new javax.swing.JLabel();
        PanelFuncion = new javax.swing.JPanel();
        TituloFuncion = new javax.swing.JPanel();
        TituloComoFunciona1 = new javax.swing.JLabel();
        CuadroSalirFun = new javax.swing.JPanel();
        TxtSalirFun = new javax.swing.JLabel();
        PanelAlumnos = new javax.swing.JPanel();
        TablaAlumno = new javax.swing.JTabbedPane();
        PanelAlumno = new javax.swing.JPanel();
        TxtAlumnoPanel = new javax.swing.JLabel();
        CuadroRNA = new javax.swing.JPanel();
        TxtRegistroAl = new javax.swing.JLabel();
        CuadroMA = new javax.swing.JPanel();
        TxtModificacionesAl = new javax.swing.JLabel();
        CuadroCA = new javax.swing.JPanel();
        TxtConsultaAl = new javax.swing.JLabel();
        CuadroRIA = new javax.swing.JPanel();
        TxtReporteInfAl = new javax.swing.JLabel();
        CuadroSalirAl = new javax.swing.JPanel();
        TxtSalirAl = new javax.swing.JLabel();
        CuadroRNAl = new javax.swing.JPanel();
        TxtRNAlu = new javax.swing.JLabel();
        CuadroSalirRNA = new javax.swing.JPanel();
        TxtSalirRNA = new javax.swing.JLabel();
        TxtNombreRNA = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        TxtApellidoPatRNA = new javax.swing.JLabel();
        primerAp = new javax.swing.JTextField();
        TxtApellidoMatRNA = new javax.swing.JLabel();
        segundoAp = new javax.swing.JTextField();
        TxtGeneroA = new javax.swing.JLabel();
        ComboBoxSexoA1 = new javax.swing.JComboBox<>();
        TxtDesnutricionA = new javax.swing.JLabel();
        ComboBoxDesnutricionA1 = new javax.swing.JComboBox<>();
        TxtAlergiasA = new javax.swing.JLabel();
        TxtOtraEnfRNA = new javax.swing.JLabel();
        otrasenfermedades = new javax.swing.JTextField();
        TxtMatriculaRNA = new javax.swing.JLabel();
        cveRAlum = new javax.swing.JTextField();
        TxtViveConRNA = new javax.swing.JLabel();
        ComboBoxViveConA1 = new javax.swing.JComboBox<>();
        TxtCarreraRNA = new javax.swing.JLabel();
        ComboBoxCarreraA1 = new javax.swing.JComboBox<>();
        BotonAceptarAlum = new javax.swing.JButton();
        BotonCancelarAlum = new javax.swing.JButton();
        TxtObesidadA1 = new javax.swing.JLabel();
        TxtSobrepesoA1 = new javax.swing.JLabel();
        TxtDiabetesA1 = new javax.swing.JLabel();
        ComboBoxAlergiasA = new javax.swing.JComboBox<>();
        ComboBoxObesidadA = new javax.swing.JComboBox<>();
        ComboBoxSobrepesoA = new javax.swing.JComboBox<>();
        ComboBoxDiabetesA = new javax.swing.JComboBox<>();
        CuadroMAlu = new javax.swing.JPanel();
        CuadroSalirMA = new javax.swing.JPanel();
        TxtModAlu = new javax.swing.JLabel();
        ComboBoxCarreraModA = new javax.swing.JComboBox<>();
        TxtGeneroRNP2 = new javax.swing.JLabel();
        ComboBoxSexoModA = new javax.swing.JComboBox<>();
        TxtDesnutricionRNP2 = new javax.swing.JLabel();
        TxtMPer1 = new javax.swing.JLabel();
        ComboBoxDesnutricionModA = new javax.swing.JComboBox<>();
        TxtSobrepesoA4 = new javax.swing.JLabel();
        TxtAlergiasRNP2 = new javax.swing.JLabel();
        TxtMatriculaRNP2 = new javax.swing.JLabel();
        TxtObesidadA4 = new javax.swing.JLabel();
        cveModA = new javax.swing.JTextField();
        TxtDiabetesA4 = new javax.swing.JLabel();
        TxtOtraEnferRNP2 = new javax.swing.JLabel();
        oEnferModA = new javax.swing.JTextField();
        BotonAceptarModA = new javax.swing.JButton();
        BotonCancelarModA = new javax.swing.JButton();
        TxtViveConRNP3 = new javax.swing.JLabel();
        ComboBoxViveModA = new javax.swing.JComboBox<>();
        TxtViveConRNP5 = new javax.swing.JLabel();
        ComboBoxSobrepesoModA = new javax.swing.JComboBox<>();
        ComboBoxAlergiasModA = new javax.swing.JComboBox<>();
        ComboBoxObesidadModA = new javax.swing.JComboBox<>();
        ComboBoxDiabetesModA = new javax.swing.JComboBox<>();
        CuadroCAlu = new javax.swing.JPanel();
        TxtCAlu = new javax.swing.JLabel();
        CuadroSalirCA = new javax.swing.JPanel();
        TxtSalirCA = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        ConsulAlum = new javax.swing.JTextArea();
        CuadroRIAlu = new javax.swing.JPanel();
        TxtRIAlu = new javax.swing.JLabel();
        CuadroSalirRIA = new javax.swing.JPanel();
        TxtSalirRIA = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        PanelPersonal = new javax.swing.JPanel();
        TablaPersonal = new javax.swing.JTabbedPane();
        PanelPersonal2 = new javax.swing.JPanel();
        TxtPersonalPanel = new javax.swing.JLabel();
        CuadroRNP = new javax.swing.JPanel();
        TxtRNP = new javax.swing.JLabel();
        CuadroMP = new javax.swing.JPanel();
        TxtMP = new javax.swing.JLabel();
        CuadroCP = new javax.swing.JPanel();
        TxtCP = new javax.swing.JLabel();
        CuadroRIP = new javax.swing.JPanel();
        TxtRIP = new javax.swing.JLabel();
        CuadroSalirP = new javax.swing.JPanel();
        TxtSalirP = new javax.swing.JLabel();
        CuadroRNPer = new javax.swing.JPanel();
        TxtPersonalRN = new javax.swing.JLabel();
        TxtNombreRNP = new javax.swing.JLabel();
        TxtApePatRNP = new javax.swing.JLabel();
        TxtApeMatP = new javax.swing.JLabel();
        TxtGeneroRNP = new javax.swing.JLabel();
        TxtDesnutricionRNP = new javax.swing.JLabel();
        TxtAlergiasRNP = new javax.swing.JLabel();
        TxtOtraEnferRNP = new javax.swing.JLabel();
        TxtMatriculaRNP = new javax.swing.JLabel();
        TxtViveConRNP = new javax.swing.JLabel();
        BotonAceptarRNP = new javax.swing.JButton();
        BotonCancelarPer = new javax.swing.JButton();
        nombrePer = new javax.swing.JTextField();
        primerApPer = new javax.swing.JTextField();
        segundoApPer = new javax.swing.JTextField();
        oEnferPer = new javax.swing.JTextField();
        cvePer = new javax.swing.JTextField();
        ComboBoxSexoP1 = new javax.swing.JComboBox<>();
        ComboBoxDesnutricionP1 = new javax.swing.JComboBox<>();
        ComboBoxAlergiasP1 = new javax.swing.JComboBox<>();
        ComboBoxEstatusP1 = new javax.swing.JComboBox<>();
        TxtObesidadA2 = new javax.swing.JLabel();
        TxtSobrepesoA2 = new javax.swing.JLabel();
        TxtDiabetesA2 = new javax.swing.JLabel();
        ComboBoxObesidadP1 = new javax.swing.JComboBox<>();
        ComboBoxSobrepesoP1 = new javax.swing.JComboBox<>();
        ComboBoxDiabetesP1 = new javax.swing.JComboBox<>();
        CuadroSalirRNPer = new javax.swing.JPanel();
        TxtRNPer = new javax.swing.JLabel();
        CuadroMPer = new javax.swing.JPanel();
        TxtMPer = new javax.swing.JLabel();
        CuadroSalirMPer = new javax.swing.JPanel();
        TxtSalirMPer = new javax.swing.JLabel();
        TxtMatriculaRNP1 = new javax.swing.JLabel();
        cvePer1 = new javax.swing.JTextField();
        TxtGeneroRNP1 = new javax.swing.JLabel();
        ComboBoxSexoModP = new javax.swing.JComboBox<>();
        TxtDesnutricionRNP1 = new javax.swing.JLabel();
        ComboBoxDesnutrucionModP = new javax.swing.JComboBox<>();
        TxtSobrepesoA3 = new javax.swing.JLabel();
        ComboBoxSobrepesoModP = new javax.swing.JComboBox<>();
        TxtAlergiasRNP1 = new javax.swing.JLabel();
        ComboBoxAlergiasModP = new javax.swing.JComboBox<>();
        TxtObesidadA3 = new javax.swing.JLabel();
        ComboBoxObesidadModP = new javax.swing.JComboBox<>();
        TxtDiabetesA3 = new javax.swing.JLabel();
        ComboBoxDiabetesModP = new javax.swing.JComboBox<>();
        TxtOtraEnferRNP1 = new javax.swing.JLabel();
        oEnferModP = new javax.swing.JTextField();
        BotonAceptarRNP1 = new javax.swing.JButton();
        BotonCancelarModP = new javax.swing.JButton();
        TxtViveConRNP1 = new javax.swing.JLabel();
        ComboBoxEstatusModP = new javax.swing.JComboBox<>();
        CuadroCPer = new javax.swing.JPanel();
        TxtCPer = new javax.swing.JLabel();
        CuadroSalirCPer = new javax.swing.JPanel();
        TxtSalirCPer = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ConsulPerso = new javax.swing.JTextArea();
        CuadroRIPer = new javax.swing.JPanel();
        TxtRIPer = new javax.swing.JLabel();
        CuadroSalirRIPer = new javax.swing.JPanel();
        TxtSalirRIP = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        PanelEnfermeria = new javax.swing.JPanel();
        TablaEnfermeria = new javax.swing.JTabbedPane();
        PanelEnfermeria2 = new javax.swing.JPanel();
        TxtEnfermeriaPanel = new javax.swing.JLabel();
        CuadroCAE = new javax.swing.JPanel();
        TxtCAE = new javax.swing.JLabel();
        CuadroCDRE = new javax.swing.JPanel();
        TxtCDRE = new javax.swing.JLabel();
        CuadroSalirE = new javax.swing.JPanel();
        TxtSalirEnf = new javax.swing.JLabel();
        CuadroRCCE = new javax.swing.JPanel();
        TxtRCCE = new javax.swing.JLabel();
        CuadroRCCEnf = new javax.swing.JPanel();
        TxtRCCEnf = new javax.swing.JLabel();
        CuadroSalirRCCEnf = new javax.swing.JPanel();
        TxtSalirRCCEnf = new javax.swing.JLabel();
        TxtMatriculaRNP3 = new javax.swing.JLabel();
        Padecimientos = new javax.swing.JTextField();
        TxtMatriculaRNP4 = new javax.swing.JLabel();
        TxtMatriculaRNP5 = new javax.swing.JLabel();
        cveHC = new javax.swing.JTextField();
        TxtMatriculaRNP6 = new javax.swing.JLabel();
        Antecedentes = new javax.swing.JTextField();
        TxtMatriculaRNP7 = new javax.swing.JLabel();
        planT = new javax.swing.JTextField();
        BotonAceptarRNA1 = new javax.swing.JButton();
        BotonCancelarHC = new javax.swing.JButton();
        medicamento = new javax.swing.JTextField();
        CuadroCAEnf = new javax.swing.JPanel();
        TxtCAEnf = new javax.swing.JLabel();
        CuadroSalirCAEnfe = new javax.swing.JPanel();
        CuadroSalirCAEnf = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        CuadroCDREnf = new javax.swing.JPanel();
        TxtCDREnf = new javax.swing.JLabel();
        CuadroSalirCDREnf = new javax.swing.JPanel();
        TxtSalirCDREnf = new javax.swing.JLabel();
        TxtMatriculaRNP8 = new javax.swing.JLabel();
        TxtMatriculaRNP9 = new javax.swing.JLabel();
        cvePer8 = new javax.swing.JTextField();
        cvePer9 = new javax.swing.JTextField();
        BotonAceptarRNA2 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        PanelMenu.setBackground(new java.awt.Color(255, 255, 255));
        PanelMenu.setAutoscrolls(true);
        PanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelIzq.setBackground(new java.awt.Color(255, 255, 255));

        Inicio.setBackground(new java.awt.Color(0, 153, 255));
        Inicio.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                InicioMouseMoved(evt);
            }
        });
        Inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InicioMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                InicioMouseExited(evt);
            }
        });
        Inicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtInicio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        TxtInicio.setForeground(new java.awt.Color(255, 255, 255));
        TxtInicio.setText("Inicio");
        TxtInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtInicioMouseClicked(evt);
            }
        });
        Inicio.add(TxtInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        Funcion.setBackground(new java.awt.Color(0, 153, 255));
        Funcion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                FuncionMouseMoved(evt);
            }
        });
        Funcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FuncionMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FuncionMouseExited(evt);
            }
        });
        Funcion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtFuncion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        TxtFuncion.setForeground(new java.awt.Color(255, 255, 255));
        TxtFuncion.setText("Función");
        Funcion.add(TxtFuncion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, -1));

        Alumnos.setBackground(new java.awt.Color(0, 153, 255));
        Alumnos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                AlumnosMouseMoved(evt);
            }
        });
        Alumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AlumnosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AlumnosMouseExited(evt);
            }
        });
        Alumnos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtAlumnos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        TxtAlumnos.setForeground(new java.awt.Color(255, 255, 255));
        TxtAlumnos.setText("Alumnos");
        Alumnos.add(TxtAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, -1));

        Personal.setBackground(new java.awt.Color(0, 153, 255));
        Personal.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                PersonalMouseMoved(evt);
            }
        });
        Personal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PersonalMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PersonalMouseExited(evt);
            }
        });
        Personal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtPersonal.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        TxtPersonal.setForeground(new java.awt.Color(255, 255, 255));
        TxtPersonal.setText("Personal");
        Personal.add(TxtPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, -1));

        Enfermeria.setBackground(new java.awt.Color(0, 153, 255));
        Enfermeria.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                EnfermeriaMouseMoved(evt);
            }
        });
        Enfermeria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EnfermeriaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EnfermeriaMouseExited(evt);
            }
        });
        Enfermeria.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtEnfermeria.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        TxtEnfermeria.setForeground(new java.awt.Color(255, 255, 255));
        TxtEnfermeria.setText("Enfermeria");
        Enfermeria.add(TxtEnfermeria, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        TextoUNIVERSIDAD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        TextoUNIVERSIDAD.setForeground(new java.awt.Color(0, 51, 51));
        TextoUNIVERSIDAD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/color 1.jpg"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 51, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 92, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelIzqLayout = new javax.swing.GroupLayout(PanelIzq);
        PanelIzq.setLayout(PanelIzqLayout);
        PanelIzqLayout.setHorizontalGroup(
            PanelIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIzqLayout.createSequentialGroup()
                .addGroup(PanelIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Enfermeria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                        .addComponent(Personal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelIzqLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(TextoUNIVERSIDAD)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelIzqLayout.createSequentialGroup()
                .addGroup(PanelIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Funcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Alumnos, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelIzqLayout.setVerticalGroup(
            PanelIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIzqLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextoUNIVERSIDAD, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Funcion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Alumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Personal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Enfermeria, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(207, Short.MAX_VALUE))
        );

        PanelMenu.add(PanelIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(-240, 0, -1, -1));

        PanelSuperior.setBackground(new java.awt.Color(0, 51, 204));

        TxtInicio2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        TxtInicio2.setForeground(new java.awt.Color(255, 255, 255));
        TxtInicio2.setText("Inicio");

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });

        CierreCompleto.setBackground(new java.awt.Color(51, 153, 255));
        CierreCompleto.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        CierreCompleto.setForeground(new java.awt.Color(255, 255, 255));
        CierreCompleto.setText("   X");
        CierreCompleto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CierreCompleto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CierreCompletoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CierreCompletoMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(338, Short.MAX_VALUE)
                .addComponent(CierreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(CierreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Universidad.jpg"))); // NOI18N

        javax.swing.GroupLayout PanelSuperiorLayout = new javax.swing.GroupLayout(PanelSuperior);
        PanelSuperior.setLayout(PanelSuperiorLayout);
        PanelSuperiorLayout.setHorizontalGroup(
            PanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSuperiorLayout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtInicio2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelSuperiorLayout.setVerticalGroup(
            PanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSuperiorLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSuperiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtInicio2))
                .addGap(26, 26, 26))
        );

        PanelMenu.add(PanelSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 0, 620, 90));

        TablaOpciones.setBackground(new java.awt.Color(255, 255, 255));
        TablaOpciones.setForeground(new java.awt.Color(204, 204, 204));

        PanelInicio.setBackground(new java.awt.Color(255, 255, 255));

        Bienvenidos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        Bienvenidos.setText("Bienvenidos");

        CuadroFuncion.setBackground(new java.awt.Color(255, 255, 51));
        CuadroFuncion.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TxtFuncion2.setBackground(new java.awt.Color(255, 255, 255));
        TxtFuncion2.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtFuncion2.setText("Función");

        PanelVerMas.setBackground(new java.awt.Color(255, 255, 255));
        PanelVerMas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                PanelVerMasMouseMoved(evt);
            }
        });
        PanelVerMas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelVerMasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelVerMasMouseExited(evt);
            }
        });

        VerMas1.setText("Ver más");

        javax.swing.GroupLayout PanelVerMasLayout = new javax.swing.GroupLayout(PanelVerMas);
        PanelVerMas.setLayout(PanelVerMasLayout);
        PanelVerMasLayout.setHorizontalGroup(
            PanelVerMasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelVerMasLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(VerMas1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        PanelVerMasLayout.setVerticalGroup(
            PanelVerMasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVerMasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VerMas1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout CuadroFuncionLayout = new javax.swing.GroupLayout(CuadroFuncion);
        CuadroFuncion.setLayout(CuadroFuncionLayout);
        CuadroFuncionLayout.setHorizontalGroup(
            CuadroFuncionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroFuncionLayout.createSequentialGroup()
                .addComponent(TxtFuncion2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelVerMas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        CuadroFuncionLayout.setVerticalGroup(
            CuadroFuncionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroFuncionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(CuadroFuncionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(TxtFuncion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelVerMas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(77, 77, 77))
        );

        CuadroAlumnos.setBackground(new java.awt.Color(0, 153, 255));
        CuadroAlumnos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TxtAlumnos2.setBackground(new java.awt.Color(255, 255, 255));
        TxtAlumnos2.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtAlumnos2.setForeground(new java.awt.Color(255, 255, 255));
        TxtAlumnos2.setText("Alumnos");

        PanelVerMas2.setBackground(new java.awt.Color(255, 255, 255));
        PanelVerMas2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                PanelVerMas2MouseMoved(evt);
            }
        });
        PanelVerMas2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelVerMas2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelVerMas2MouseExited(evt);
            }
        });

        VerMas2.setText("Ver más");

        javax.swing.GroupLayout PanelVerMas2Layout = new javax.swing.GroupLayout(PanelVerMas2);
        PanelVerMas2.setLayout(PanelVerMas2Layout);
        PanelVerMas2Layout.setHorizontalGroup(
            PanelVerMas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelVerMas2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(VerMas2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        PanelVerMas2Layout.setVerticalGroup(
            PanelVerMas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVerMas2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VerMas2, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout CuadroAlumnosLayout = new javax.swing.GroupLayout(CuadroAlumnos);
        CuadroAlumnos.setLayout(CuadroAlumnosLayout);
        CuadroAlumnosLayout.setHorizontalGroup(
            CuadroAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroAlumnosLayout.createSequentialGroup()
                .addComponent(TxtAlumnos2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroAlumnosLayout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addComponent(PanelVerMas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        CuadroAlumnosLayout.setVerticalGroup(
            CuadroAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroAlumnosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TxtAlumnos2)
                .addGap(137, 137, 137)
                .addComponent(PanelVerMas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        CuadroPersonal.setBackground(new java.awt.Color(0, 204, 153));
        CuadroPersonal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TxtPersonal2.setBackground(new java.awt.Color(255, 255, 255));
        TxtPersonal2.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtPersonal2.setForeground(new java.awt.Color(255, 255, 255));
        TxtPersonal2.setText("Personal");

        PanelVerMas3.setBackground(new java.awt.Color(255, 255, 255));
        PanelVerMas3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                PanelVerMas3MouseMoved(evt);
            }
        });
        PanelVerMas3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelVerMas3MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelVerMas3MouseExited(evt);
            }
        });

        VerMas3.setText("Ver más");

        javax.swing.GroupLayout PanelVerMas3Layout = new javax.swing.GroupLayout(PanelVerMas3);
        PanelVerMas3.setLayout(PanelVerMas3Layout);
        PanelVerMas3Layout.setHorizontalGroup(
            PanelVerMas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelVerMas3Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(VerMas3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        PanelVerMas3Layout.setVerticalGroup(
            PanelVerMas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVerMas3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VerMas3, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout CuadroPersonalLayout = new javax.swing.GroupLayout(CuadroPersonal);
        CuadroPersonal.setLayout(CuadroPersonalLayout);
        CuadroPersonalLayout.setHorizontalGroup(
            CuadroPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroPersonalLayout.createSequentialGroup()
                .addComponent(TxtPersonal2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroPersonalLayout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addComponent(PanelVerMas3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        CuadroPersonalLayout.setVerticalGroup(
            CuadroPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroPersonalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TxtPersonal2)
                .addGap(136, 136, 136)
                .addComponent(PanelVerMas3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        CuadrosEnfermeria.setBackground(new java.awt.Color(255, 51, 51));
        CuadrosEnfermeria.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TxtEnfermeria2.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtEnfermeria2.setForeground(new java.awt.Color(255, 255, 255));
        TxtEnfermeria2.setText("Enfermeria");

        PanelVerMas4.setBackground(new java.awt.Color(255, 255, 255));
        PanelVerMas4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                PanelVerMas4MouseMoved(evt);
            }
        });
        PanelVerMas4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelVerMas4MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelVerMas4MouseExited(evt);
            }
        });

        VerMas4.setText("Ver más");

        javax.swing.GroupLayout PanelVerMas4Layout = new javax.swing.GroupLayout(PanelVerMas4);
        PanelVerMas4.setLayout(PanelVerMas4Layout);
        PanelVerMas4Layout.setHorizontalGroup(
            PanelVerMas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelVerMas4Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(VerMas4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        PanelVerMas4Layout.setVerticalGroup(
            PanelVerMas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVerMas4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VerMas4, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout CuadrosEnfermeriaLayout = new javax.swing.GroupLayout(CuadrosEnfermeria);
        CuadrosEnfermeria.setLayout(CuadrosEnfermeriaLayout);
        CuadrosEnfermeriaLayout.setHorizontalGroup(
            CuadrosEnfermeriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadrosEnfermeriaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelVerMas4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(CuadrosEnfermeriaLayout.createSequentialGroup()
                .addComponent(TxtEnfermeria2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 84, Short.MAX_VALUE))
        );
        CuadrosEnfermeriaLayout.setVerticalGroup(
            CuadrosEnfermeriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadrosEnfermeriaLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(TxtEnfermeria2)
                .addGap(139, 139, 139)
                .addComponent(PanelVerMas4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout PanelInicioLayout = new javax.swing.GroupLayout(PanelInicio);
        PanelInicio.setLayout(PanelInicioLayout);
        PanelInicioLayout.setHorizontalGroup(
            PanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CuadroFuncion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelInicioLayout.createSequentialGroup()
                        .addGroup(PanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Bienvenidos, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelInicioLayout.createSequentialGroup()
                                .addComponent(CuadroAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CuadroPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(CuadrosEnfermeria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PanelInicioLayout.setVerticalGroup(
            PanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInicioLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Bienvenidos)
                .addGap(18, 18, 18)
                .addComponent(CuadroFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(PanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CuadroAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CuadroPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CuadrosEnfermeria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        TablaOpciones.addTab("tab1", PanelInicio);

        PanelFuncion.setBackground(new java.awt.Color(255, 255, 255));

        TituloFuncion.setBackground(new java.awt.Color(255, 255, 255));

        TituloComoFunciona1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        TituloComoFunciona1.setText("¿Cómo funciona el panel?");

        CuadroSalirFun.setBackground(new java.awt.Color(255, 255, 51));
        CuadroSalirFun.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CuadroSalirFunMouseMoved(evt);
            }
        });
        CuadroSalirFun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CuadroSalirFunMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CuadroSalirFunMouseExited(evt);
            }
        });

        TxtSalirFun.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtSalirFun.setText("Salir");

        javax.swing.GroupLayout CuadroSalirFunLayout = new javax.swing.GroupLayout(CuadroSalirFun);
        CuadroSalirFun.setLayout(CuadroSalirFunLayout);
        CuadroSalirFunLayout.setHorizontalGroup(
            CuadroSalirFunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroSalirFunLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(TxtSalirFun, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        CuadroSalirFunLayout.setVerticalGroup(
            CuadroSalirFunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroSalirFunLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TxtSalirFun)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout TituloFuncionLayout = new javax.swing.GroupLayout(TituloFuncion);
        TituloFuncion.setLayout(TituloFuncionLayout);
        TituloFuncionLayout.setHorizontalGroup(
            TituloFuncionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloFuncionLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(TituloComoFunciona1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(219, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TituloFuncionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CuadroSalirFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        TituloFuncionLayout.setVerticalGroup(
            TituloFuncionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloFuncionLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(TituloComoFunciona1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 435, Short.MAX_VALUE)
                .addComponent(CuadroSalirFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelFuncionLayout = new javax.swing.GroupLayout(PanelFuncion);
        PanelFuncion.setLayout(PanelFuncionLayout);
        PanelFuncionLayout.setHorizontalGroup(
            PanelFuncionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFuncionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TituloFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelFuncionLayout.setVerticalGroup(
            PanelFuncionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFuncionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TituloFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        TablaOpciones.addTab("tab2", PanelFuncion);

        PanelAlumnos.setBackground(new java.awt.Color(255, 255, 255));

        TablaAlumno.setBackground(new java.awt.Color(255, 255, 255));

        PanelAlumno.setBackground(new java.awt.Color(255, 255, 255));

        TxtAlumnoPanel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        TxtAlumnoPanel.setText("Alumnos");

        CuadroRNA.setBackground(new java.awt.Color(0, 153, 255));
        CuadroRNA.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CuadroRNAMouseMoved(evt);
            }
        });
        CuadroRNA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CuadroRNAMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CuadroRNAMouseExited(evt);
            }
        });

        TxtRegistroAl.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtRegistroAl.setText("Registro Nuevo");

        javax.swing.GroupLayout CuadroRNALayout = new javax.swing.GroupLayout(CuadroRNA);
        CuadroRNA.setLayout(CuadroRNALayout);
        CuadroRNALayout.setHorizontalGroup(
            CuadroRNALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroRNALayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(TxtRegistroAl, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        CuadroRNALayout.setVerticalGroup(
            CuadroRNALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroRNALayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(TxtRegistroAl)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        CuadroMA.setBackground(new java.awt.Color(0, 153, 255));
        CuadroMA.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CuadroMAMouseMoved(evt);
            }
        });
        CuadroMA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CuadroMAMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CuadroMAMouseExited(evt);
            }
        });

        TxtModificacionesAl.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtModificacionesAl.setText("Modificaciones");

        javax.swing.GroupLayout CuadroMALayout = new javax.swing.GroupLayout(CuadroMA);
        CuadroMA.setLayout(CuadroMALayout);
        CuadroMALayout.setHorizontalGroup(
            CuadroMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroMALayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(TxtModificacionesAl, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        CuadroMALayout.setVerticalGroup(
            CuadroMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroMALayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(TxtModificacionesAl)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        CuadroCA.setBackground(new java.awt.Color(0, 153, 255));
        CuadroCA.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CuadroCAMouseMoved(evt);
            }
        });
        CuadroCA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CuadroCAMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CuadroCAMouseExited(evt);
            }
        });

        TxtConsultaAl.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtConsultaAl.setText("Consulta");

        javax.swing.GroupLayout CuadroCALayout = new javax.swing.GroupLayout(CuadroCA);
        CuadroCA.setLayout(CuadroCALayout);
        CuadroCALayout.setHorizontalGroup(
            CuadroCALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroCALayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(TxtConsultaAl, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        CuadroCALayout.setVerticalGroup(
            CuadroCALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroCALayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(TxtConsultaAl)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        CuadroRIA.setBackground(new java.awt.Color(0, 153, 255));
        CuadroRIA.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CuadroRIAMouseMoved(evt);
            }
        });
        CuadroRIA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CuadroRIAMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CuadroRIAMouseExited(evt);
            }
        });

        TxtReporteInfAl.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtReporteInfAl.setText("Reporte de Informacion");

        javax.swing.GroupLayout CuadroRIALayout = new javax.swing.GroupLayout(CuadroRIA);
        CuadroRIA.setLayout(CuadroRIALayout);
        CuadroRIALayout.setHorizontalGroup(
            CuadroRIALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroRIALayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(TxtReporteInfAl, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        CuadroRIALayout.setVerticalGroup(
            CuadroRIALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroRIALayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(TxtReporteInfAl)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        CuadroSalirAl.setBackground(new java.awt.Color(0, 153, 255));
        CuadroSalirAl.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CuadroSalirAlMouseMoved(evt);
            }
        });
        CuadroSalirAl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CuadroSalirAlMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CuadroSalirAlMouseExited(evt);
            }
        });

        TxtSalirAl.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtSalirAl.setText("Salir");

        javax.swing.GroupLayout CuadroSalirAlLayout = new javax.swing.GroupLayout(CuadroSalirAl);
        CuadroSalirAl.setLayout(CuadroSalirAlLayout);
        CuadroSalirAlLayout.setHorizontalGroup(
            CuadroSalirAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroSalirAlLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(TxtSalirAl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        CuadroSalirAlLayout.setVerticalGroup(
            CuadroSalirAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroSalirAlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TxtSalirAl)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelAlumnoLayout = new javax.swing.GroupLayout(PanelAlumno);
        PanelAlumno.setLayout(PanelAlumnoLayout);
        PanelAlumnoLayout.setHorizontalGroup(
            PanelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAlumnoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(TxtAlumnoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAlumnoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CuadroSalirAl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(PanelAlumnoLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(PanelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CuadroRNA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CuadroCA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addGroup(PanelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CuadroMA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CuadroRIA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(65, 65, 65))
        );
        PanelAlumnoLayout.setVerticalGroup(
            PanelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAlumnoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(TxtAlumnoPanel)
                .addGap(33, 33, 33)
                .addGroup(PanelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CuadroRNA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CuadroMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PanelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAlumnoLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(CuadroRIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelAlumnoLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(CuadroCA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                .addComponent(CuadroSalirAl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );

        TablaAlumno.addTab("Inicio", PanelAlumno);

        CuadroRNAl.setBackground(new java.awt.Color(255, 255, 255));

        TxtRNAlu.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        TxtRNAlu.setText("Registro Nuevo");

        CuadroSalirRNA.setBackground(new java.awt.Color(0, 153, 255));
        CuadroSalirRNA.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CuadroSalirRNAMouseMoved(evt);
            }
        });
        CuadroSalirRNA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CuadroSalirRNAMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CuadroSalirRNAMouseExited(evt);
            }
        });

        TxtSalirRNA.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtSalirRNA.setText("Salir");

        javax.swing.GroupLayout CuadroSalirRNALayout = new javax.swing.GroupLayout(CuadroSalirRNA);
        CuadroSalirRNA.setLayout(CuadroSalirRNALayout);
        CuadroSalirRNALayout.setHorizontalGroup(
            CuadroSalirRNALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroSalirRNALayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(TxtSalirRNA, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        CuadroSalirRNALayout.setVerticalGroup(
            CuadroSalirRNALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroSalirRNALayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(TxtSalirRNA)
                .addContainerGap())
        );

        TxtNombreRNA.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtNombreRNA.setText("Nombre(s):");

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });

        TxtApellidoPatRNA.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtApellidoPatRNA.setText("Apellido Paterno:");

        primerAp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primerApActionPerformed(evt);
            }
        });
        primerAp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                primerApKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                primerApKeyTyped(evt);
            }
        });

        TxtApellidoMatRNA.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtApellidoMatRNA.setText("Apellido Materno:");

        segundoAp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                segundoApKeyTyped(evt);
            }
        });

        TxtGeneroA.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtGeneroA.setText("Genero:");

        ComboBoxSexoA1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona la opción", "M", "F" }));
        ComboBoxSexoA1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBoxSexoA1ItemStateChanged(evt);
            }
        });
        ComboBoxSexoA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxSexoA1ActionPerformed(evt);
            }
        });

        TxtDesnutricionA.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtDesnutricionA.setText("Desnutrición:");

        ComboBoxDesnutricionA1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No", "Selecciona una opción" }));
        ComboBoxDesnutricionA1.setSelectedIndex(2);
        ComboBoxDesnutricionA1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBoxDesnutricionA1ItemStateChanged(evt);
            }
        });

        TxtAlergiasA.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtAlergiasA.setText("Alergias:");

        TxtOtraEnfRNA.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtOtraEnfRNA.setText("Otra Enfermedad:");

        otrasenfermedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otrasenfermedadesActionPerformed(evt);
            }
        });
        otrasenfermedades.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                otrasenfermedadesKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                otrasenfermedadesKeyTyped(evt);
            }
        });

        TxtMatriculaRNA.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtMatriculaRNA.setText("Matricula: ");

        cveRAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cveRAlumActionPerformed(evt);
            }
        });
        cveRAlum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cveRAlumKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cveRAlumKeyTyped(evt);
            }
        });

        TxtViveConRNA.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtViveConRNA.setText("Vive Con:");

        ComboBoxViveConA1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona la opción", "1.-Mamá y Papá", "2.-Solo Mamá", "3.-Solo Papá", "4.-Otro" }));
        ComboBoxViveConA1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBoxViveConA1ItemStateChanged(evt);
            }
        });

        TxtCarreraRNA.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtCarreraRNA.setText("Carrera:");

        ComboBoxCarreraA1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona la opcion", "1.-Ing. Electronica", "2.-Ing.Electromecánica", "3.-Ing.Gestión empresarial", "4.-Ing. Industrial", "5.-Ing. Logística", "6.-Ing. Mecatrónica", "7.-Ing. Química", "8.-Ing. Sistemas", "9.-Ing.Tics" }));

        BotonAceptarAlum.setText("Aceptar");
        BotonAceptarAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAceptarAlumActionPerformed(evt);
            }
        });
        BotonAceptarAlum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BotonAceptarAlumKeyPressed(evt);
            }
        });

        BotonCancelarAlum.setText("Cancelar");
        BotonCancelarAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarAlumActionPerformed(evt);
            }
        });

        TxtObesidadA1.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtObesidadA1.setText("Obesidad:");

        TxtSobrepesoA1.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtSobrepesoA1.setText("Sobrepeso:");

        TxtDiabetesA1.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtDiabetesA1.setText("Diabetes:");

        ComboBoxAlergiasA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No", "Selecciona una opción" }));
        ComboBoxAlergiasA.setSelectedIndex(2);
        ComboBoxAlergiasA.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBoxAlergiasAItemStateChanged(evt);
            }
        });

        ComboBoxObesidadA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No", "Selecciona una opción" }));
        ComboBoxObesidadA.setSelectedIndex(2);
        ComboBoxObesidadA.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBoxObesidadAItemStateChanged(evt);
            }
        });

        ComboBoxSobrepesoA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No", "Selecciona una opción" }));
        ComboBoxSobrepesoA.setSelectedIndex(2);
        ComboBoxSobrepesoA.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBoxSobrepesoAItemStateChanged(evt);
            }
        });

        ComboBoxDiabetesA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No", "Selecciona una opción" }));
        ComboBoxDiabetesA.setSelectedIndex(2);
        ComboBoxDiabetesA.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBoxDiabetesAItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout CuadroRNAlLayout = new javax.swing.GroupLayout(CuadroRNAl);
        CuadroRNAl.setLayout(CuadroRNAlLayout);
        CuadroRNAlLayout.setHorizontalGroup(
            CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroRNAlLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CuadroRNAlLayout.createSequentialGroup()
                        .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtApellidoPatRNA)
                            .addComponent(TxtApellidoMatRNA, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNombreRNA))
                        .addGap(23, 23, 23)
                        .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre)
                            .addComponent(segundoAp)
                            .addComponent(primerAp)))
                    .addGroup(CuadroRNAlLayout.createSequentialGroup()
                        .addComponent(TxtMatriculaRNA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cveRAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroRNAlLayout.createSequentialGroup()
                        .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtViveConRNA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(CuadroRNAlLayout.createSequentialGroup()
                                .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtGeneroA, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtAlergiasA, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtDesnutricionA, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtObesidadA1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtSobrepesoA1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtOtraEnfRNA)
                                    .addComponent(TxtCarreraRNA))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboBoxCarreraA1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ComboBoxSexoA1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ComboBoxDesnutricionA1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(otrasenfermedades)
                                .addComponent(ComboBoxViveConA1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ComboBoxAlergiasA, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ComboBoxObesidadA, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ComboBoxSobrepesoA, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CuadroRNAlLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonCancelarAlum)
                            .addComponent(BotonAceptarAlum))
                        .addContainerGap(110, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroRNAlLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CuadroSalirRNA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
            .addGroup(CuadroRNAlLayout.createSequentialGroup()
                .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CuadroRNAlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TxtRNAlu))
                    .addGroup(CuadroRNAlLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(TxtDiabetesA1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(ComboBoxDiabetesA, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CuadroRNAlLayout.setVerticalGroup(
            CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroRNAlLayout.createSequentialGroup()
                .addComponent(TxtRNAlu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtMatriculaRNA)
                    .addComponent(cveRAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNombreRNA)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtApellidoPatRNA)
                    .addComponent(primerAp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtApellidoMatRNA)
                    .addComponent(segundoAp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CuadroRNAlLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtGeneroA)
                            .addComponent(ComboBoxSexoA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboBoxDesnutricionA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtDesnutricionA)))
                    .addGroup(CuadroRNAlLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(BotonAceptarAlum)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtAlergiasA)
                    .addComponent(ComboBoxAlergiasA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CuadroRNAlLayout.createSequentialGroup()
                        .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboBoxObesidadA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonCancelarAlum))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboBoxSobrepesoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CuadroRNAlLayout.createSequentialGroup()
                        .addComponent(TxtObesidadA1)
                        .addGap(18, 18, 18)
                        .addComponent(TxtSobrepesoA1)))
                .addGap(18, 18, 18)
                .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxDiabetesA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtDiabetesA1))
                .addGap(18, 18, 18)
                .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtOtraEnfRNA)
                    .addComponent(otrasenfermedades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtViveConRNA)
                    .addComponent(ComboBoxViveConA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CuadroRNAlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TxtCarreraRNA)
                        .addComponent(ComboBoxCarreraA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CuadroSalirRNA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        TablaAlumno.addTab("Registro", CuadroRNAl);

        CuadroMAlu.setBackground(new java.awt.Color(255, 255, 255));

        CuadroSalirMA.setBackground(new java.awt.Color(0, 153, 255));
        CuadroSalirMA.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CuadroSalirMAMouseMoved(evt);
            }
        });
        CuadroSalirMA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CuadroSalirMAMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CuadroSalirMAMouseExited(evt);
            }
        });

        TxtModAlu.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtModAlu.setText("Salir");

        javax.swing.GroupLayout CuadroSalirMALayout = new javax.swing.GroupLayout(CuadroSalirMA);
        CuadroSalirMA.setLayout(CuadroSalirMALayout);
        CuadroSalirMALayout.setHorizontalGroup(
            CuadroSalirMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroSalirMALayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(TxtModAlu)
                .addGap(25, 25, 25))
        );
        CuadroSalirMALayout.setVerticalGroup(
            CuadroSalirMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroSalirMALayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(TxtModAlu)
                .addContainerGap())
        );

        ComboBoxCarreraModA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona la opción", "1.-Base", "2.-Temporal" }));
        ComboBoxCarreraModA.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBoxCarreraModAItemStateChanged(evt);
            }
        });
        ComboBoxCarreraModA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxCarreraModAActionPerformed(evt);
            }
        });

        TxtGeneroRNP2.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtGeneroRNP2.setText("Genero:");

        ComboBoxSexoModA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona la opción", "M", "F" }));
        ComboBoxSexoModA.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBoxSexoModAItemStateChanged(evt);
            }
        });
        ComboBoxSexoModA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxSexoModAActionPerformed(evt);
            }
        });

        TxtDesnutricionRNP2.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtDesnutricionRNP2.setText("Desnutrición:");

        TxtMPer1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        TxtMPer1.setText("Modificaciones");

        ComboBoxDesnutricionModA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No", "Selecciona una opción" }));
        ComboBoxDesnutricionModA.setSelectedIndex(2);
        ComboBoxDesnutricionModA.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBoxDesnutricionModAItemStateChanged(evt);
            }
        });
        ComboBoxDesnutricionModA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxDesnutricionModAActionPerformed(evt);
            }
        });

        TxtSobrepesoA4.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtSobrepesoA4.setText("Sobrepeso:");

        TxtAlergiasRNP2.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtAlergiasRNP2.setText("Alergías:");

        TxtMatriculaRNP2.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtMatriculaRNP2.setText("Ingrese la matricula:");

        TxtObesidadA4.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtObesidadA4.setText("Obesidad:");

        cveModA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cveModAActionPerformed(evt);
            }
        });
        cveModA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cveModAKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cveModAKeyTyped(evt);
            }
        });

        TxtDiabetesA4.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtDiabetesA4.setText("Diabetes:");

        TxtOtraEnferRNP2.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtOtraEnferRNP2.setText("Otra Enfermedad:");

        oEnferModA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                oEnferModAKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                oEnferModAKeyTyped(evt);
            }
        });

        BotonAceptarModA.setText("Aceptar");
        BotonAceptarModA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAceptarModAActionPerformed(evt);
            }
        });

        BotonCancelarModA.setText("Cancelar");
        BotonCancelarModA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarModAActionPerformed(evt);
            }
        });

        TxtViveConRNP3.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtViveConRNP3.setText("Vive con");

        ComboBoxViveModA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona la opción", "1.-Base", "2.-Temporal" }));
        ComboBoxViveModA.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBoxViveModAItemStateChanged(evt);
            }
        });
        ComboBoxViveModA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxViveModAActionPerformed(evt);
            }
        });

        TxtViveConRNP5.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtViveConRNP5.setText("Carrera");

        ComboBoxSobrepesoModA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No", "Selecciona una opción" }));
        ComboBoxSobrepesoModA.setSelectedIndex(2);
        ComboBoxSobrepesoModA.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBoxSobrepesoModAItemStateChanged(evt);
            }
        });
        ComboBoxSobrepesoModA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxSobrepesoModAActionPerformed(evt);
            }
        });

        ComboBoxAlergiasModA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No", "Selecciona una opción" }));
        ComboBoxAlergiasModA.setSelectedIndex(2);
        ComboBoxAlergiasModA.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBoxAlergiasModAItemStateChanged(evt);
            }
        });
        ComboBoxAlergiasModA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxAlergiasModAActionPerformed(evt);
            }
        });

        ComboBoxObesidadModA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No", "Selecciona una opción" }));
        ComboBoxObesidadModA.setSelectedIndex(2);
        ComboBoxObesidadModA.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBoxObesidadModAItemStateChanged(evt);
            }
        });
        ComboBoxObesidadModA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxObesidadModAActionPerformed(evt);
            }
        });

        ComboBoxDiabetesModA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No", "Selecciona una opción" }));
        ComboBoxDiabetesModA.setSelectedIndex(2);
        ComboBoxDiabetesModA.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBoxDiabetesModAItemStateChanged(evt);
            }
        });
        ComboBoxDiabetesModA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxDiabetesModAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CuadroMAluLayout = new javax.swing.GroupLayout(CuadroMAlu);
        CuadroMAlu.setLayout(CuadroMAluLayout);
        CuadroMAluLayout.setHorizontalGroup(
            CuadroMAluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroMAluLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(CuadroMAluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CuadroMAluLayout.createSequentialGroup()
                        .addComponent(TxtMatriculaRNP2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cveModA, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TxtMPer1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CuadroMAluLayout.createSequentialGroup()
                        .addGroup(CuadroMAluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CuadroMAluLayout.createSequentialGroup()
                                .addGroup(CuadroMAluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtGeneroRNP2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtDesnutricionRNP2)
                                    .addComponent(TxtSobrepesoA4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtAlergiasRNP2)
                                    .addComponent(TxtObesidadA4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtDiabetesA4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroMAluLayout.createSequentialGroup()
                                .addGroup(CuadroMAluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtViveConRNP3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtOtraEnferRNP2)
                                    .addComponent(TxtViveConRNP5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(CuadroMAluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboBoxDesnutricionModA, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxSexoModA, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxSobrepesoModA, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxAlergiasModA, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxObesidadModA, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxDiabetesModA, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(oEnferModA, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxViveModA, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxCarreraModA, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(224, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroMAluLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CuadroSalirMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(CuadroMAluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CuadroMAluLayout.createSequentialGroup()
                    .addContainerGap(464, Short.MAX_VALUE)
                    .addGroup(CuadroMAluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroMAluLayout.createSequentialGroup()
                            .addComponent(BotonAceptarModA)
                            .addGap(4, 4, 4))
                        .addComponent(BotonCancelarModA))
                    .addGap(50, 50, 50)))
        );
        CuadroMAluLayout.setVerticalGroup(
            CuadroMAluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroMAluLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(TxtMPer1)
                .addGap(30, 30, 30)
                .addGroup(CuadroMAluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtMatriculaRNP2)
                    .addComponent(cveModA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CuadroMAluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtGeneroRNP2)
                    .addComponent(ComboBoxSexoModA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CuadroMAluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CuadroMAluLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(ComboBoxDesnutricionModA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComboBoxSobrepesoModA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComboBoxAlergiasModA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(CuadroMAluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboBoxObesidadModA)
                            .addComponent(TxtObesidadA4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(CuadroMAluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboBoxDiabetesModA)
                            .addComponent(TxtDiabetesA4))
                        .addGap(18, 18, 18)
                        .addGroup(CuadroMAluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(oEnferModA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtOtraEnferRNP2)))
                    .addGroup(CuadroMAluLayout.createSequentialGroup()
                        .addComponent(TxtDesnutricionRNP2)
                        .addGap(18, 18, 18)
                        .addComponent(TxtSobrepesoA4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtAlergiasRNP2)))
                .addGap(12, 12, 12)
                .addGroup(CuadroMAluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxViveModA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtViveConRNP3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CuadroMAluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxCarreraModA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtViveConRNP5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CuadroSalirMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
            .addGroup(CuadroMAluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CuadroMAluLayout.createSequentialGroup()
                    .addGap(211, 211, 211)
                    .addComponent(BotonAceptarModA)
                    .addGap(58, 58, 58)
                    .addComponent(BotonCancelarModA)
                    .addContainerGap(274, Short.MAX_VALUE)))
        );

        TablaAlumno.addTab("Modificaciones", CuadroMAlu);

        CuadroCAlu.setBackground(new java.awt.Color(255, 255, 255));
        CuadroCAlu.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                CuadroCAluAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                CuadroCAluAncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        TxtCAlu.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        TxtCAlu.setText("Consulta");

        CuadroSalirCA.setBackground(new java.awt.Color(0, 153, 255));
        CuadroSalirCA.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CuadroSalirCAMouseMoved(evt);
            }
        });
        CuadroSalirCA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CuadroSalirCAMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CuadroSalirCAMouseExited(evt);
            }
        });

        TxtSalirCA.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtSalirCA.setText("Salir");

        javax.swing.GroupLayout CuadroSalirCALayout = new javax.swing.GroupLayout(CuadroSalirCA);
        CuadroSalirCA.setLayout(CuadroSalirCALayout);
        CuadroSalirCALayout.setHorizontalGroup(
            CuadroSalirCALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroSalirCALayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(TxtSalirCA, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        CuadroSalirCALayout.setVerticalGroup(
            CuadroSalirCALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroSalirCALayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(TxtSalirCA)
                .addContainerGap())
        );

        ConsulAlum.setColumns(20);
        ConsulAlum.setRows(5);
        ConsulAlum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ConsulAlumMouseEntered(evt);
            }
        });
        jScrollPane5.setViewportView(ConsulAlum);

        javax.swing.GroupLayout CuadroCAluLayout = new javax.swing.GroupLayout(CuadroCAlu);
        CuadroCAlu.setLayout(CuadroCAluLayout);
        CuadroCAluLayout.setHorizontalGroup(
            CuadroCAluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroCAluLayout.createSequentialGroup()
                .addGroup(CuadroCAluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CuadroCAluLayout.createSequentialGroup()
                        .addGap(493, 493, 493)
                        .addComponent(CuadroSalirCA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CuadroCAluLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(CuadroCAluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtCAlu, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        CuadroCAluLayout.setVerticalGroup(
            CuadroCAluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroCAluLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(TxtCAlu)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CuadroSalirCA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        TablaAlumno.addTab("Consulta", CuadroCAlu);

        CuadroRIAlu.setBackground(new java.awt.Color(255, 255, 255));

        TxtRIAlu.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        TxtRIAlu.setText("Reporte de Información");

        CuadroSalirRIA.setBackground(new java.awt.Color(0, 153, 255));
        CuadroSalirRIA.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CuadroSalirRIAMouseMoved(evt);
            }
        });
        CuadroSalirRIA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CuadroSalirRIAMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CuadroSalirRIAMouseExited(evt);
            }
        });

        TxtSalirRIA.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtSalirRIA.setText("Salir");

        javax.swing.GroupLayout CuadroSalirRIALayout = new javax.swing.GroupLayout(CuadroSalirRIA);
        CuadroSalirRIA.setLayout(CuadroSalirRIALayout);
        CuadroSalirRIALayout.setHorizontalGroup(
            CuadroSalirRIALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroSalirRIALayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(TxtSalirRIA, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        CuadroSalirRIALayout.setVerticalGroup(
            CuadroSalirRIALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroSalirRIALayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(TxtSalirRIA)
                .addContainerGap())
        );

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        javax.swing.GroupLayout CuadroRIAluLayout = new javax.swing.GroupLayout(CuadroRIAlu);
        CuadroRIAlu.setLayout(CuadroRIAluLayout);
        CuadroRIAluLayout.setHorizontalGroup(
            CuadroRIAluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroRIAluLayout.createSequentialGroup()
                .addGroup(CuadroRIAluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroRIAluLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CuadroSalirRIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CuadroRIAluLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(TxtRIAlu, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(CuadroRIAluLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CuadroRIAluLayout.setVerticalGroup(
            CuadroRIAluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroRIAluLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(TxtRIAlu)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(CuadroSalirRIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );

        TablaAlumno.addTab("Reporte de informacion", CuadroRIAlu);

        javax.swing.GroupLayout PanelAlumnosLayout = new javax.swing.GroupLayout(PanelAlumnos);
        PanelAlumnos.setLayout(PanelAlumnosLayout);
        PanelAlumnosLayout.setHorizontalGroup(
            PanelAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TablaAlumno)
        );
        PanelAlumnosLayout.setVerticalGroup(
            PanelAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAlumnosLayout.createSequentialGroup()
                .addComponent(TablaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        TablaAlumno.getAccessibleContext().setAccessibleName("Consul");

        TablaOpciones.addTab("tab3", PanelAlumnos);

        PanelPersonal.setBackground(new java.awt.Color(255, 255, 255));

        TablaPersonal.setBackground(new java.awt.Color(255, 255, 255));
        TablaPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaPersonalMouseClicked(evt);
            }
        });

        PanelPersonal2.setBackground(new java.awt.Color(255, 255, 255));

        TxtPersonalPanel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        TxtPersonalPanel.setText("Personal");

        CuadroRNP.setBackground(new java.awt.Color(0, 204, 153));
        CuadroRNP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CuadroRNPMouseMoved(evt);
            }
        });
        CuadroRNP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CuadroRNPMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CuadroRNPMouseExited(evt);
            }
        });

        TxtRNP.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtRNP.setText("Registro Nuevo");

        javax.swing.GroupLayout CuadroRNPLayout = new javax.swing.GroupLayout(CuadroRNP);
        CuadroRNP.setLayout(CuadroRNPLayout);
        CuadroRNPLayout.setHorizontalGroup(
            CuadroRNPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroRNPLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(TxtRNP)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        CuadroRNPLayout.setVerticalGroup(
            CuadroRNPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroRNPLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(TxtRNP)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CuadroMP.setBackground(new java.awt.Color(0, 204, 153));
        CuadroMP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CuadroMPMouseMoved(evt);
            }
        });
        CuadroMP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CuadroMPMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CuadroMPMouseExited(evt);
            }
        });

        TxtMP.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtMP.setText("Modificaciones");

        javax.swing.GroupLayout CuadroMPLayout = new javax.swing.GroupLayout(CuadroMP);
        CuadroMP.setLayout(CuadroMPLayout);
        CuadroMPLayout.setHorizontalGroup(
            CuadroMPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroMPLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(TxtMP)
                .addGap(26, 26, 26))
        );
        CuadroMPLayout.setVerticalGroup(
            CuadroMPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroMPLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(TxtMP)
                .addContainerGap())
        );

        CuadroCP.setBackground(new java.awt.Color(0, 204, 153));
        CuadroCP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CuadroCPMouseMoved(evt);
            }
        });
        CuadroCP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CuadroCPMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CuadroCPMouseExited(evt);
            }
        });

        TxtCP.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtCP.setText("Consulta");

        javax.swing.GroupLayout CuadroCPLayout = new javax.swing.GroupLayout(CuadroCP);
        CuadroCP.setLayout(CuadroCPLayout);
        CuadroCPLayout.setHorizontalGroup(
            CuadroCPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroCPLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(TxtCP, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        CuadroCPLayout.setVerticalGroup(
            CuadroCPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroCPLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(TxtCP)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CuadroRIP.setBackground(new java.awt.Color(0, 204, 153));
        CuadroRIP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CuadroRIPMouseMoved(evt);
            }
        });
        CuadroRIP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CuadroRIPMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CuadroRIPMouseExited(evt);
            }
        });

        TxtRIP.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtRIP.setText("Reporte de Información");

        javax.swing.GroupLayout CuadroRIPLayout = new javax.swing.GroupLayout(CuadroRIP);
        CuadroRIP.setLayout(CuadroRIPLayout);
        CuadroRIPLayout.setHorizontalGroup(
            CuadroRIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroRIPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TxtRIP, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );
        CuadroRIPLayout.setVerticalGroup(
            CuadroRIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroRIPLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(TxtRIP)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        CuadroSalirP.setBackground(new java.awt.Color(0, 204, 153));
        CuadroSalirP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CuadroSalirPMouseMoved(evt);
            }
        });
        CuadroSalirP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CuadroSalirPMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CuadroSalirPMouseExited(evt);
            }
        });

        TxtSalirP.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtSalirP.setText("Salir");

        javax.swing.GroupLayout CuadroSalirPLayout = new javax.swing.GroupLayout(CuadroSalirP);
        CuadroSalirP.setLayout(CuadroSalirPLayout);
        CuadroSalirPLayout.setHorizontalGroup(
            CuadroSalirPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroSalirPLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(TxtSalirP, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        CuadroSalirPLayout.setVerticalGroup(
            CuadroSalirPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroSalirPLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(TxtSalirP)
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelPersonal2Layout = new javax.swing.GroupLayout(PanelPersonal2);
        PanelPersonal2.setLayout(PanelPersonal2Layout);
        PanelPersonal2Layout.setHorizontalGroup(
            PanelPersonal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPersonal2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(PanelPersonal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CuadroRNP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtPersonalPanel)
                    .addComponent(CuadroCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addGroup(PanelPersonal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CuadroMP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CuadroRIP, javax.swing.GroupLayout.PREFERRED_SIZE, 171, Short.MAX_VALUE))
                .addGap(82, 82, 82))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPersonal2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CuadroSalirP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        PanelPersonal2Layout.setVerticalGroup(
            PanelPersonal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPersonal2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TxtPersonalPanel)
                .addGroup(PanelPersonal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPersonal2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(CuadroRNP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelPersonal2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(CuadroMP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(PanelPersonal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CuadroRIP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CuadroCP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(195, 195, 195)
                .addComponent(CuadroSalirP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        TablaPersonal.addTab("Inicio", PanelPersonal2);

        CuadroRNPer.setBackground(new java.awt.Color(255, 255, 255));

        TxtPersonalRN.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        TxtPersonalRN.setText("Registro Nuevo");

        TxtNombreRNP.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtNombreRNP.setText("Nombre(s):");

        TxtApePatRNP.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtApePatRNP.setText("Apellido Paterno:");

        TxtApeMatP.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtApeMatP.setText("Apellido Materno:");

        TxtGeneroRNP.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtGeneroRNP.setText("Genero:");

        TxtDesnutricionRNP.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtDesnutricionRNP.setText("Desnutrición:");

        TxtAlergiasRNP.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtAlergiasRNP.setText("Alergías:");

        TxtOtraEnferRNP.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtOtraEnferRNP.setText("Otra Enfermedad:");

        TxtMatriculaRNP.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtMatriculaRNP.setText("Numero de matricula_:");

        TxtViveConRNP.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtViveConRNP.setText("Estatus:");

        BotonAceptarRNP.setText("Aceptar");
        BotonAceptarRNP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAceptarRNPActionPerformed(evt);
            }
        });

        BotonCancelarPer.setText("Cancelar");
        BotonCancelarPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarPerActionPerformed(evt);
            }
        });

        nombrePer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombrePerKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombrePerKeyTyped(evt);
            }
        });

        primerApPer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                primerApPerKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                primerApPerKeyTyped(evt);
            }
        });

        segundoApPer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                segundoApPerKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                segundoApPerKeyTyped(evt);
            }
        });

        oEnferPer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                oEnferPerKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                oEnferPerKeyTyped(evt);
            }
        });

        cvePer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cvePerKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cvePerKeyTyped(evt);
            }
        });

        ComboBoxSexoP1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona la opción", "M", "F" }));
        ComboBoxSexoP1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBoxSexoP1ItemStateChanged(evt);
            }
        });
        ComboBoxSexoP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxSexoP1ActionPerformed(evt);
            }
        });

        ComboBoxDesnutricionP1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona la opcion", "Si", "No" }));
        ComboBoxDesnutricionP1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBoxDesnutricionP1ItemStateChanged(evt);
            }
        });

        ComboBoxAlergiasP1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona la opcion", "Si", "No" }));
        ComboBoxAlergiasP1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBoxAlergiasP1ItemStateChanged(evt);
            }
        });
        ComboBoxAlergiasP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxAlergiasP1ActionPerformed(evt);
            }
        });

        ComboBoxEstatusP1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona la opción", "1.-Base", "2.-Temporal" }));
        ComboBoxEstatusP1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBoxEstatusP1ItemStateChanged(evt);
            }
        });
        ComboBoxEstatusP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxEstatusP1ActionPerformed(evt);
            }
        });

        TxtObesidadA2.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtObesidadA2.setText("Obesidad:");

        TxtSobrepesoA2.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtSobrepesoA2.setText("Sobrepeso:");

        TxtDiabetesA2.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtDiabetesA2.setText("Diabetes:");

        ComboBoxObesidadP1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona la opcion", "Si", "No" }));
        ComboBoxObesidadP1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBoxObesidadP1ItemStateChanged(evt);
            }
        });

        ComboBoxSobrepesoP1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona la opcion", "Si", "No" }));
        ComboBoxSobrepesoP1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBoxSobrepesoP1ItemStateChanged(evt);
            }
        });

        ComboBoxDiabetesP1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona la opcion", "Si", "No" }));
        ComboBoxDiabetesP1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBoxDiabetesP1ItemStateChanged(evt);
            }
        });
        ComboBoxDiabetesP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxDiabetesP1ActionPerformed(evt);
            }
        });

        CuadroSalirRNPer.setBackground(new java.awt.Color(0, 204, 153));
        CuadroSalirRNPer.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CuadroSalirRNPerMouseMoved(evt);
            }
        });
        CuadroSalirRNPer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CuadroSalirRNPerMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CuadroSalirRNPerMouseExited(evt);
            }
        });

        TxtRNPer.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtRNPer.setText("Salir");

        javax.swing.GroupLayout CuadroSalirRNPerLayout = new javax.swing.GroupLayout(CuadroSalirRNPer);
        CuadroSalirRNPer.setLayout(CuadroSalirRNPerLayout);
        CuadroSalirRNPerLayout.setHorizontalGroup(
            CuadroSalirRNPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroSalirRNPerLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(TxtRNPer, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        CuadroSalirRNPerLayout.setVerticalGroup(
            CuadroSalirRNPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroSalirRNPerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TxtRNPer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout CuadroRNPerLayout = new javax.swing.GroupLayout(CuadroRNPer);
        CuadroRNPer.setLayout(CuadroRNPerLayout);
        CuadroRNPerLayout.setHorizontalGroup(
            CuadroRNPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroRNPerLayout.createSequentialGroup()
                .addGroup(CuadroRNPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtPersonalRN)
                    .addGroup(CuadroRNPerLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(CuadroRNPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtNombreRNP)
                            .addComponent(TxtMatriculaRNP)
                            .addComponent(TxtApePatRNP)
                            .addComponent(TxtApeMatP)
                            .addComponent(TxtGeneroRNP, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtDesnutricionRNP)
                            .addComponent(TxtAlergiasRNP)
                            .addComponent(TxtObesidadA2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtSobrepesoA2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtDiabetesA2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtOtraEnferRNP)
                            .addComponent(TxtViveConRNP, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(CuadroRNPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboBoxSexoP1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(segundoApPer, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxDesnutricionP1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxAlergiasP1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxObesidadP1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxSobrepesoP1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxDiabetesP1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oEnferPer, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CuadroRNPerLayout.createSequentialGroup()
                        .addGroup(CuadroRNPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cvePer, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombrePer, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(primerApPer, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxEstatusP1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74)
                        .addGroup(CuadroRNPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonCancelarPer)
                            .addComponent(BotonAceptarRNP))))
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroRNPerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CuadroSalirRNPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        CuadroRNPerLayout.setVerticalGroup(
            CuadroRNPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroRNPerLayout.createSequentialGroup()
                .addComponent(TxtPersonalRN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(CuadroRNPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtMatriculaRNP)
                    .addComponent(cvePer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CuadroRNPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNombreRNP)
                    .addComponent(nombrePer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(CuadroRNPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtApePatRNP)
                    .addGroup(CuadroRNPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(primerApPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BotonAceptarRNP)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CuadroRNPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtApeMatP)
                    .addComponent(segundoApPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(CuadroRNPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtGeneroRNP)
                    .addComponent(ComboBoxSexoP1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CuadroRNPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtDesnutricionRNP)
                    .addComponent(ComboBoxDesnutricionP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonCancelarPer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CuadroRNPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtAlergiasRNP)
                    .addComponent(ComboBoxAlergiasP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CuadroRNPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtObesidadA2)
                    .addComponent(ComboBoxObesidadP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CuadroRNPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtSobrepesoA2)
                    .addComponent(ComboBoxSobrepesoP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CuadroRNPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxDiabetesP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtDiabetesA2))
                .addGap(18, 18, 18)
                .addGroup(CuadroRNPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oEnferPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtOtraEnferRNP))
                .addGap(18, 18, 18)
                .addGroup(CuadroRNPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxEstatusP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtViveConRNP, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(CuadroSalirRNPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        TablaPersonal.addTab("Registro", CuadroRNPer);

        CuadroMPer.setBackground(new java.awt.Color(255, 255, 255));

        TxtMPer.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        TxtMPer.setText("Modificaciones");

        CuadroSalirMPer.setBackground(new java.awt.Color(0, 204, 153));
        CuadroSalirMPer.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CuadroSalirMPerMouseMoved(evt);
            }
        });
        CuadroSalirMPer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CuadroSalirMPerMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CuadroSalirMPerMouseExited(evt);
            }
        });

        TxtSalirMPer.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtSalirMPer.setText("Salir");

        javax.swing.GroupLayout CuadroSalirMPerLayout = new javax.swing.GroupLayout(CuadroSalirMPer);
        CuadroSalirMPer.setLayout(CuadroSalirMPerLayout);
        CuadroSalirMPerLayout.setHorizontalGroup(
            CuadroSalirMPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroSalirMPerLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(TxtSalirMPer, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        CuadroSalirMPerLayout.setVerticalGroup(
            CuadroSalirMPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroSalirMPerLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(TxtSalirMPer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TxtMatriculaRNP1.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtMatriculaRNP1.setText("Ingrese numero de empleado:");

        cvePer1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cvePer1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cvePer1KeyTyped(evt);
            }
        });

        TxtGeneroRNP1.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtGeneroRNP1.setText("Genero:");

        ComboBoxSexoModP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona la opción", "M", "F" }));
        ComboBoxSexoModP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBoxSexoModPItemStateChanged(evt);
            }
        });
        ComboBoxSexoModP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxSexoModPActionPerformed(evt);
            }
        });

        TxtDesnutricionRNP1.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtDesnutricionRNP1.setText("Desnutrición:");

        ComboBoxDesnutrucionModP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No", "Selecciona una opción" }));
        ComboBoxDesnutrucionModP.setSelectedIndex(2);
        ComboBoxDesnutrucionModP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBoxDesnutrucionModPItemStateChanged(evt);
            }
        });

        TxtSobrepesoA3.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtSobrepesoA3.setText("Sobrepeso:");

        ComboBoxSobrepesoModP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No", "Selecciona una opción" }));
        ComboBoxSobrepesoModP.setSelectedIndex(2);
        ComboBoxSobrepesoModP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBoxSobrepesoModPItemStateChanged(evt);
            }
        });

        TxtAlergiasRNP1.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtAlergiasRNP1.setText("Alergías:");

        ComboBoxAlergiasModP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No", "Selecciona una opción" }));
        ComboBoxAlergiasModP.setSelectedIndex(2);
        ComboBoxAlergiasModP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBoxAlergiasModPItemStateChanged(evt);
            }
        });
        ComboBoxAlergiasModP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxAlergiasModPActionPerformed(evt);
            }
        });

        TxtObesidadA3.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtObesidadA3.setText("Obesidad:");

        ComboBoxObesidadModP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No", "Selecciona una opción" }));
        ComboBoxObesidadModP.setSelectedIndex(2);
        ComboBoxObesidadModP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBoxObesidadModPItemStateChanged(evt);
            }
        });

        TxtDiabetesA3.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtDiabetesA3.setText("Diabetes:");

        ComboBoxDiabetesModP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No", "Selecciona una opción" }));
        ComboBoxDiabetesModP.setSelectedIndex(2);
        ComboBoxDiabetesModP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBoxDiabetesModPItemStateChanged(evt);
            }
        });
        ComboBoxDiabetesModP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxDiabetesModPActionPerformed(evt);
            }
        });

        TxtOtraEnferRNP1.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtOtraEnferRNP1.setText("Otra Enfermedad:");

        oEnferModP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                oEnferModPKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                oEnferModPKeyTyped(evt);
            }
        });

        BotonAceptarRNP1.setText("Aceptar");
        BotonAceptarRNP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAceptarRNP1ActionPerformed(evt);
            }
        });

        BotonCancelarModP.setText("Cancelar");
        BotonCancelarModP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarModPActionPerformed(evt);
            }
        });

        TxtViveConRNP1.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtViveConRNP1.setText("Estatus");

        ComboBoxEstatusModP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona la opción", "1.-Base", "2.-Temporal" }));
        ComboBoxEstatusModP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBoxEstatusModPItemStateChanged(evt);
            }
        });
        ComboBoxEstatusModP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxEstatusModPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CuadroMPerLayout = new javax.swing.GroupLayout(CuadroMPer);
        CuadroMPer.setLayout(CuadroMPerLayout);
        CuadroMPerLayout.setHorizontalGroup(
            CuadroMPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroMPerLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(CuadroMPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CuadroMPerLayout.createSequentialGroup()
                        .addComponent(TxtMatriculaRNP1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cvePer1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(171, Short.MAX_VALUE))
                    .addGroup(CuadroMPerLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                        .addGroup(CuadroMPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(CuadroMPerLayout.createSequentialGroup()
                                .addComponent(TxtOtraEnferRNP1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(CuadroMPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(oEnferModP, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ComboBoxEstatusModP, 0, 180, Short.MAX_VALUE)))
                            .addGroup(CuadroMPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TxtMPer, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtViveConRNP1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(CuadroMPerLayout.createSequentialGroup()
                                    .addGroup(CuadroMPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TxtDesnutricionRNP1)
                                        .addGroup(CuadroMPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(CuadroMPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(TxtSobrepesoA3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(TxtObesidadA3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(TxtDiabetesA3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(TxtAlergiasRNP1)
                                        .addComponent(TxtGeneroRNP1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(53, 53, 53)
                                    .addGroup(CuadroMPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ComboBoxSexoModP, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(CuadroMPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(ComboBoxObesidadModP, javax.swing.GroupLayout.Alignment.LEADING, 0, 180, Short.MAX_VALUE)
                                            .addComponent(ComboBoxSobrepesoModP, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(ComboBoxDesnutrucionModP, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(ComboBoxAlergiasModP, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(ComboBoxDiabetesModP, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(CuadroMPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroMPerLayout.createSequentialGroup()
                                .addComponent(CuadroSalirMPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroMPerLayout.createSequentialGroup()
                                .addComponent(BotonAceptarRNP1)
                                .addGap(66, 66, 66))
                            .addGroup(CuadroMPerLayout.createSequentialGroup()
                                .addComponent(BotonCancelarModP)
                                .addContainerGap())))))
        );
        CuadroMPerLayout.setVerticalGroup(
            CuadroMPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroMPerLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(TxtMPer)
                .addGap(22, 22, 22)
                .addGroup(CuadroMPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtMatriculaRNP1)
                    .addComponent(cvePer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CuadroMPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtGeneroRNP1)
                    .addComponent(ComboBoxSexoModP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(CuadroMPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CuadroMPerLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(CuadroMPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtDesnutricionRNP1)
                            .addComponent(ComboBoxDesnutrucionModP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CuadroMPerLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(BotonAceptarRNP1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CuadroMPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtSobrepesoA3)
                    .addComponent(ComboBoxSobrepesoModP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(CuadroMPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CuadroMPerLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(CuadroMPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtAlergiasRNP1)
                            .addComponent(ComboBoxAlergiasModP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CuadroMPerLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(BotonCancelarModP)))
                .addGap(18, 18, 18)
                .addGroup(CuadroMPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtObesidadA3)
                    .addComponent(ComboBoxObesidadModP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CuadroMPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtDiabetesA3)
                    .addComponent(ComboBoxDiabetesModP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CuadroMPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oEnferModP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtOtraEnferRNP1))
                .addGroup(CuadroMPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CuadroMPerLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(TxtViveConRNP1))
                    .addGroup(CuadroMPerLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(ComboBoxEstatusModP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(CuadroSalirMPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        TablaPersonal.addTab("Modificaciones", CuadroMPer);

        CuadroCPer.setBackground(new java.awt.Color(255, 255, 255));

        TxtCPer.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        TxtCPer.setText("Consulta");

        CuadroSalirCPer.setBackground(new java.awt.Color(0, 204, 153));
        CuadroSalirCPer.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CuadroSalirCPerMouseMoved(evt);
            }
        });
        CuadroSalirCPer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CuadroSalirCPerMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CuadroSalirCPerMouseExited(evt);
            }
        });

        TxtSalirCPer.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtSalirCPer.setText("Salir");

        javax.swing.GroupLayout CuadroSalirCPerLayout = new javax.swing.GroupLayout(CuadroSalirCPer);
        CuadroSalirCPer.setLayout(CuadroSalirCPerLayout);
        CuadroSalirCPerLayout.setHorizontalGroup(
            CuadroSalirCPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroSalirCPerLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(TxtSalirCPer, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        CuadroSalirCPerLayout.setVerticalGroup(
            CuadroSalirCPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroSalirCPerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TxtSalirCPer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ConsulPerso.setColumns(20);
        ConsulPerso.setRows(5);
        ConsulPerso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ConsulPersoMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(ConsulPerso);

        javax.swing.GroupLayout CuadroCPerLayout = new javax.swing.GroupLayout(CuadroCPer);
        CuadroCPer.setLayout(CuadroCPerLayout);
        CuadroCPerLayout.setHorizontalGroup(
            CuadroCPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroCPerLayout.createSequentialGroup()
                .addGroup(CuadroCPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CuadroSalirCPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CuadroCPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(CuadroCPerLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(TxtCPer, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(CuadroCPerLayout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        CuadroCPerLayout.setVerticalGroup(
            CuadroCPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroCPerLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(TxtCPer)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(CuadroSalirCPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        TablaPersonal.addTab("Consulta", CuadroCPer);

        CuadroRIPer.setBackground(new java.awt.Color(255, 255, 255));

        TxtRIPer.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        TxtRIPer.setText("Reporte de Información");

        CuadroSalirRIPer.setBackground(new java.awt.Color(0, 204, 153));
        CuadroSalirRIPer.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CuadroSalirRIPerMouseMoved(evt);
            }
        });
        CuadroSalirRIPer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CuadroSalirRIPerMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CuadroSalirRIPerMouseExited(evt);
            }
        });

        TxtSalirRIP.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtSalirRIP.setText("Salir");

        javax.swing.GroupLayout CuadroSalirRIPerLayout = new javax.swing.GroupLayout(CuadroSalirRIPer);
        CuadroSalirRIPer.setLayout(CuadroSalirRIPerLayout);
        CuadroSalirRIPerLayout.setHorizontalGroup(
            CuadroSalirRIPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroSalirRIPerLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(TxtSalirRIP, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        CuadroSalirRIPerLayout.setVerticalGroup(
            CuadroSalirRIPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroSalirRIPerLayout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addComponent(TxtSalirRIP))
        );

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout CuadroRIPerLayout = new javax.swing.GroupLayout(CuadroRIPer);
        CuadroRIPer.setLayout(CuadroRIPerLayout);
        CuadroRIPerLayout.setHorizontalGroup(
            CuadroRIPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroRIPerLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(CuadroRIPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtRIPer, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroRIPerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CuadroSalirRIPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        CuadroRIPerLayout.setVerticalGroup(
            CuadroRIPerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroRIPerLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(TxtRIPer)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CuadroSalirRIPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        TablaPersonal.addTab("Reporte de informacion", CuadroRIPer);

        javax.swing.GroupLayout PanelPersonalLayout = new javax.swing.GroupLayout(PanelPersonal);
        PanelPersonal.setLayout(PanelPersonalLayout);
        PanelPersonalLayout.setHorizontalGroup(
            PanelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TablaPersonal)
        );
        PanelPersonalLayout.setVerticalGroup(
            PanelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPersonalLayout.createSequentialGroup()
                .addComponent(TablaPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        TablaOpciones.addTab("tab4", PanelPersonal);

        PanelEnfermeria.setBackground(new java.awt.Color(255, 255, 255));

        TablaEnfermeria.setBackground(new java.awt.Color(255, 255, 255));

        PanelEnfermeria2.setBackground(new java.awt.Color(255, 255, 255));

        TxtEnfermeriaPanel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        TxtEnfermeriaPanel.setText("Enfermeria");

        CuadroCAE.setBackground(new java.awt.Color(255, 51, 51));
        CuadroCAE.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                CuadroCAEMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CuadroCAEMouseMoved(evt);
            }
        });
        CuadroCAE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CuadroCAEMouseExited(evt);
            }
        });

        TxtCAE.setBackground(new java.awt.Color(255, 51, 51));
        TxtCAE.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtCAE.setText("Consultas Almacenadas");

        javax.swing.GroupLayout CuadroCAELayout = new javax.swing.GroupLayout(CuadroCAE);
        CuadroCAE.setLayout(CuadroCAELayout);
        CuadroCAELayout.setHorizontalGroup(
            CuadroCAELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroCAELayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(TxtCAE)
                .addContainerGap())
        );
        CuadroCAELayout.setVerticalGroup(
            CuadroCAELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroCAELayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(TxtCAE)
                .addGap(14, 14, 14))
        );

        CuadroCDRE.setBackground(new java.awt.Color(255, 51, 51));
        CuadroCDRE.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CuadroCDREMouseMoved(evt);
            }
        });
        CuadroCDRE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CuadroCDREMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CuadroCDREMouseExited(evt);
            }
        });

        TxtCDRE.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtCDRE.setText("Consultas dentro de un rango");

        javax.swing.GroupLayout CuadroCDRELayout = new javax.swing.GroupLayout(CuadroCDRE);
        CuadroCDRE.setLayout(CuadroCDRELayout);
        CuadroCDRELayout.setHorizontalGroup(
            CuadroCDRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroCDRELayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TxtCDRE)
                .addGap(30, 30, 30))
        );
        CuadroCDRELayout.setVerticalGroup(
            CuadroCDRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroCDRELayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(TxtCDRE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        CuadroSalirE.setBackground(new java.awt.Color(255, 51, 51));
        CuadroSalirE.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CuadroSalirEMouseMoved(evt);
            }
        });
        CuadroSalirE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CuadroSalirEMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CuadroSalirEMouseExited(evt);
            }
        });

        TxtSalirEnf.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtSalirEnf.setText("Salir");

        javax.swing.GroupLayout CuadroSalirELayout = new javax.swing.GroupLayout(CuadroSalirE);
        CuadroSalirE.setLayout(CuadroSalirELayout);
        CuadroSalirELayout.setHorizontalGroup(
            CuadroSalirELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroSalirELayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(TxtSalirEnf, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        CuadroSalirELayout.setVerticalGroup(
            CuadroSalirELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroSalirELayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(TxtSalirEnf)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CuadroRCCE.setBackground(new java.awt.Color(255, 51, 51));
        CuadroRCCE.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CuadroRCCEMouseMoved(evt);
            }
        });
        CuadroRCCE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CuadroRCCEMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CuadroRCCEMouseExited(evt);
            }
        });

        TxtRCCE.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtRCCE.setText("Registro de consultorio clinico");

        javax.swing.GroupLayout CuadroRCCELayout = new javax.swing.GroupLayout(CuadroRCCE);
        CuadroRCCE.setLayout(CuadroRCCELayout);
        CuadroRCCELayout.setHorizontalGroup(
            CuadroRCCELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroRCCELayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TxtRCCE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CuadroRCCELayout.setVerticalGroup(
            CuadroRCCELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroRCCELayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(TxtRCCE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelEnfermeria2Layout = new javax.swing.GroupLayout(PanelEnfermeria2);
        PanelEnfermeria2.setLayout(PanelEnfermeria2Layout);
        PanelEnfermeria2Layout.setHorizontalGroup(
            PanelEnfermeria2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEnfermeria2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CuadroCDRE, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEnfermeria2Layout.createSequentialGroup()
                .addGroup(PanelEnfermeria2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelEnfermeria2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CuadroSalirE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelEnfermeria2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(PanelEnfermeria2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelEnfermeria2Layout.createSequentialGroup()
                                .addComponent(CuadroRCCE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                                .addComponent(CuadroCAE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TxtEnfermeriaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27))
        );
        PanelEnfermeria2Layout.setVerticalGroup(
            PanelEnfermeria2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEnfermeria2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(TxtEnfermeriaPanel)
                .addGap(34, 34, 34)
                .addGroup(PanelEnfermeria2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CuadroCAE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CuadroRCCE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addComponent(CuadroCDRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                .addComponent(CuadroSalirE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        TablaEnfermeria.addTab("Inicio", PanelEnfermeria2);

        CuadroRCCEnf.setBackground(new java.awt.Color(255, 255, 255));

        TxtRCCEnf.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        TxtRCCEnf.setText("Registro de Historial Clinico");

        CuadroSalirRCCEnf.setBackground(new java.awt.Color(255, 51, 51));
        CuadroSalirRCCEnf.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CuadroSalirRCCEnfMouseMoved(evt);
            }
        });
        CuadroSalirRCCEnf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CuadroSalirRCCEnfMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CuadroSalirRCCEnfMouseExited(evt);
            }
        });

        TxtSalirRCCEnf.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtSalirRCCEnf.setText("Salir");

        javax.swing.GroupLayout CuadroSalirRCCEnfLayout = new javax.swing.GroupLayout(CuadroSalirRCCEnf);
        CuadroSalirRCCEnf.setLayout(CuadroSalirRCCEnfLayout);
        CuadroSalirRCCEnfLayout.setHorizontalGroup(
            CuadroSalirRCCEnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroSalirRCCEnfLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(TxtSalirRCCEnf, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        CuadroSalirRCCEnfLayout.setVerticalGroup(
            CuadroSalirRCCEnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroSalirRCCEnfLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(TxtSalirRCCEnf)
                .addContainerGap())
        );

        TxtMatriculaRNP3.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtMatriculaRNP3.setText("Clave del paciente");

        Padecimientos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PadecimientosKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PadecimientosKeyTyped(evt);
            }
        });

        TxtMatriculaRNP4.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtMatriculaRNP4.setText("Padecimiento actual");

        TxtMatriculaRNP5.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtMatriculaRNP5.setText("Antecedentes personales");

        cveHC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cveHCKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cveHCKeyTyped(evt);
            }
        });

        TxtMatriculaRNP6.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtMatriculaRNP6.setText("Medicamento a recetar");

        Antecedentes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AntecedentesKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AntecedentesKeyTyped(evt);
            }
        });

        TxtMatriculaRNP7.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtMatriculaRNP7.setText("Plan de tratamiento medico");

        planT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                planTKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                planTKeyTyped(evt);
            }
        });

        BotonAceptarRNA1.setText("Aceptar");
        BotonAceptarRNA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAceptarRNA1ActionPerformed(evt);
            }
        });

        BotonCancelarHC.setText("Cancelar");
        BotonCancelarHC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarHCActionPerformed(evt);
            }
        });

        medicamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                medicamentoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                medicamentoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout CuadroRCCEnfLayout = new javax.swing.GroupLayout(CuadroRCCEnf);
        CuadroRCCEnf.setLayout(CuadroRCCEnfLayout);
        CuadroRCCEnfLayout.setHorizontalGroup(
            CuadroRCCEnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroRCCEnfLayout.createSequentialGroup()
                .addGroup(CuadroRCCEnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CuadroRCCEnfLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(TxtRCCEnf, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CuadroRCCEnfLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(BotonAceptarRNA1)
                        .addGap(54, 54, 54)
                        .addComponent(BotonCancelarHC)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroRCCEnfLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CuadroRCCEnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CuadroRCCEnfLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(CuadroSalirRCCEnf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CuadroRCCEnfLayout.createSequentialGroup()
                        .addGroup(CuadroRCCEnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtMatriculaRNP3)
                            .addComponent(TxtMatriculaRNP4)
                            .addComponent(TxtMatriculaRNP6)
                            .addComponent(TxtMatriculaRNP7)
                            .addComponent(TxtMatriculaRNP5))
                        .addGroup(CuadroRCCEnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CuadroRCCEnfLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(CuadroRCCEnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Padecimientos)
                                    .addComponent(Antecedentes)
                                    .addComponent(cveHC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CuadroRCCEnfLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(planT, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)))))
                .addGap(17, 17, 17))
            .addGroup(CuadroRCCEnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CuadroRCCEnfLayout.createSequentialGroup()
                    .addGap(192, 192, 192)
                    .addComponent(medicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(193, Short.MAX_VALUE)))
        );
        CuadroRCCEnfLayout.setVerticalGroup(
            CuadroRCCEnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroRCCEnfLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(TxtRCCEnf)
                .addGap(71, 71, 71)
                .addGroup(CuadroRCCEnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtMatriculaRNP3)
                    .addComponent(cveHC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CuadroRCCEnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtMatriculaRNP4)
                    .addComponent(Padecimientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(CuadroRCCEnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Antecedentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtMatriculaRNP5))
                .addGap(18, 18, 18)
                .addComponent(TxtMatriculaRNP6)
                .addGap(18, 18, 18)
                .addGroup(CuadroRCCEnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtMatriculaRNP7)
                    .addComponent(planT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(CuadroRCCEnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonCancelarHC)
                    .addComponent(BotonAceptarRNA1))
                .addGap(89, 89, 89)
                .addComponent(CuadroSalirRCCEnf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(CuadroRCCEnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CuadroRCCEnfLayout.createSequentialGroup()
                    .addGap(251, 251, 251)
                    .addComponent(medicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(251, Short.MAX_VALUE)))
        );

        TablaEnfermeria.addTab("Registro CC", CuadroRCCEnf);

        CuadroCAEnf.setBackground(new java.awt.Color(255, 255, 255));

        TxtCAEnf.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        TxtCAEnf.setText("Consultas Almacenadas");

        CuadroSalirCAEnfe.setBackground(new java.awt.Color(255, 51, 51));
        CuadroSalirCAEnfe.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CuadroSalirCAEnfeMouseMoved(evt);
            }
        });
        CuadroSalirCAEnfe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CuadroSalirCAEnfeMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CuadroSalirCAEnfeMouseExited(evt);
            }
        });

        CuadroSalirCAEnf.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        CuadroSalirCAEnf.setText("Salir");

        javax.swing.GroupLayout CuadroSalirCAEnfeLayout = new javax.swing.GroupLayout(CuadroSalirCAEnfe);
        CuadroSalirCAEnfe.setLayout(CuadroSalirCAEnfeLayout);
        CuadroSalirCAEnfeLayout.setHorizontalGroup(
            CuadroSalirCAEnfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroSalirCAEnfeLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(CuadroSalirCAEnf, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        CuadroSalirCAEnfeLayout.setVerticalGroup(
            CuadroSalirCAEnfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroSalirCAEnfeLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(CuadroSalirCAEnf)
                .addContainerGap())
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane4.setViewportView(jTextArea1);

        javax.swing.GroupLayout CuadroCAEnfLayout = new javax.swing.GroupLayout(CuadroCAEnf);
        CuadroCAEnf.setLayout(CuadroCAEnfLayout);
        CuadroCAEnfLayout.setHorizontalGroup(
            CuadroCAEnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroCAEnfLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(CuadroCAEnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CuadroCAEnfLayout.createSequentialGroup()
                        .addGroup(CuadroCAEnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CuadroSalirCAEnfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(CuadroCAEnfLayout.createSequentialGroup()
                        .addComponent(TxtCAEnf)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        CuadroCAEnfLayout.setVerticalGroup(
            CuadroCAEnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroCAEnfLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(TxtCAEnf)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                .addGap(24, 24, 24)
                .addComponent(CuadroSalirCAEnfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        TablaEnfermeria.addTab("Consultas almacenadas", CuadroCAEnf);

        CuadroCDREnf.setBackground(new java.awt.Color(255, 255, 255));

        TxtCDREnf.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        TxtCDREnf.setText("Consultas Dentro de un Rango");

        CuadroSalirCDREnf.setBackground(new java.awt.Color(255, 51, 51));
        CuadroSalirCDREnf.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CuadroSalirCDREnfMouseMoved(evt);
            }
        });
        CuadroSalirCDREnf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CuadroSalirCDREnfMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CuadroSalirCDREnfMouseExited(evt);
            }
        });

        TxtSalirCDREnf.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        TxtSalirCDREnf.setText("Salir");

        javax.swing.GroupLayout CuadroSalirCDREnfLayout = new javax.swing.GroupLayout(CuadroSalirCDREnf);
        CuadroSalirCDREnf.setLayout(CuadroSalirCDREnfLayout);
        CuadroSalirCDREnfLayout.setHorizontalGroup(
            CuadroSalirCDREnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroSalirCDREnfLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(TxtSalirCDREnf, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        CuadroSalirCDREnfLayout.setVerticalGroup(
            CuadroSalirCDREnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroSalirCDREnfLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TxtSalirCDREnf)
                .addContainerGap())
        );

        TxtMatriculaRNP8.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtMatriculaRNP8.setText("Introduzca fecha 1");

        TxtMatriculaRNP9.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        TxtMatriculaRNP9.setText("Introduzca fecha 2");

        cvePer8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cvePer8ActionPerformed(evt);
            }
        });
        cvePer8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cvePer8KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cvePer8KeyTyped(evt);
            }
        });

        cvePer9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cvePer9KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cvePer9KeyTyped(evt);
            }
        });

        BotonAceptarRNA2.setText("Generar");
        BotonAceptarRNA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAceptarRNA2ActionPerformed(evt);
            }
        });

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane6.setViewportView(jTextArea4);

        javax.swing.GroupLayout CuadroCDREnfLayout = new javax.swing.GroupLayout(CuadroCDREnf);
        CuadroCDREnf.setLayout(CuadroCDREnfLayout);
        CuadroCDREnfLayout.setHorizontalGroup(
            CuadroCDREnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroCDREnfLayout.createSequentialGroup()
                .addGroup(CuadroCDREnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CuadroCDREnfLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(TxtCDREnf, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CuadroCDREnfLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(CuadroCDREnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CuadroCDREnfLayout.createSequentialGroup()
                                .addComponent(TxtMatriculaRNP9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cvePer9, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CuadroCDREnfLayout.createSequentialGroup()
                                .addComponent(TxtMatriculaRNP8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cvePer8, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(BotonAceptarRNA2)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroCDREnfLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CuadroCDREnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6)
                    .addGroup(CuadroCDREnfLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(CuadroSalirCDREnf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        CuadroCDREnfLayout.setVerticalGroup(
            CuadroCDREnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroCDREnfLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(TxtCDREnf)
                .addGap(18, 18, 18)
                .addGroup(CuadroCDREnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtMatriculaRNP8)
                    .addComponent(cvePer8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonAceptarRNA2))
                .addGap(9, 9, 9)
                .addGroup(CuadroCDREnfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtMatriculaRNP9)
                    .addComponent(cvePer9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(CuadroSalirCDREnf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        TablaEnfermeria.addTab("Consultas dentro de un rango", CuadroCDREnf);

        javax.swing.GroupLayout PanelEnfermeriaLayout = new javax.swing.GroupLayout(PanelEnfermeria);
        PanelEnfermeria.setLayout(PanelEnfermeriaLayout);
        PanelEnfermeriaLayout.setHorizontalGroup(
            PanelEnfermeriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TablaEnfermeria, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );
        PanelEnfermeriaLayout.setVerticalGroup(
            PanelEnfermeriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEnfermeriaLayout.createSequentialGroup()
                .addComponent(TablaEnfermeria, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        TablaOpciones.addTab("tab5", PanelEnfermeria);

        PanelMenu.add(TablaOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 590, 560));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono-menu.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono-menu1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        PanelMenu.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtInicioMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_TxtInicioMouseClicked
    {//GEN-HEADEREND:event_TxtInicioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtInicioMouseClicked

    private void InicioMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_InicioMouseClicked
    {//GEN-HEADEREND:event_InicioMouseClicked
        TablaOpciones.setSelectedIndex(0);
    }//GEN-LAST:event_InicioMouseClicked

    private void InicioMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_InicioMouseMoved
    {//GEN-HEADEREND:event_InicioMouseMoved
        Inicio.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_InicioMouseMoved

    private void InicioMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_InicioMouseExited
    {//GEN-HEADEREND:event_InicioMouseExited
        Inicio.setBackground(new Color(0, 153, 255));
    }//GEN-LAST:event_InicioMouseExited

    private void FuncionMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_FuncionMouseClicked
    {//GEN-HEADEREND:event_FuncionMouseClicked
        TablaOpciones.setSelectedIndex(1);
    }//GEN-LAST:event_FuncionMouseClicked

    private void FuncionMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_FuncionMouseMoved
    {//GEN-HEADEREND:event_FuncionMouseMoved
        Funcion.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_FuncionMouseMoved

    private void FuncionMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_FuncionMouseExited
    {//GEN-HEADEREND:event_FuncionMouseExited
        Funcion.setBackground(new Color(0, 153, 255));
    }//GEN-LAST:event_FuncionMouseExited

    private void AlumnosMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_AlumnosMouseClicked
    {//GEN-HEADEREND:event_AlumnosMouseClicked
        TablaOpciones.setSelectedIndex(2);
    }//GEN-LAST:event_AlumnosMouseClicked

    private void AlumnosMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_AlumnosMouseMoved
    {//GEN-HEADEREND:event_AlumnosMouseMoved
        Alumnos.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_AlumnosMouseMoved

    private void AlumnosMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_AlumnosMouseExited
    {//GEN-HEADEREND:event_AlumnosMouseExited
        Alumnos.setBackground(new Color(0, 153, 255));
    }//GEN-LAST:event_AlumnosMouseExited

    private void PersonalMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_PersonalMouseClicked
    {//GEN-HEADEREND:event_PersonalMouseClicked
        TablaOpciones.setSelectedIndex(3);
    }//GEN-LAST:event_PersonalMouseClicked

    private void PersonalMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_PersonalMouseMoved
    {//GEN-HEADEREND:event_PersonalMouseMoved
        Personal.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_PersonalMouseMoved

    private void PersonalMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_PersonalMouseExited
    {//GEN-HEADEREND:event_PersonalMouseExited
        Personal.setBackground(new Color(0, 153, 255));
    }//GEN-LAST:event_PersonalMouseExited

    private void EnfermeriaMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_EnfermeriaMouseClicked
    {//GEN-HEADEREND:event_EnfermeriaMouseClicked
        TablaOpciones.setSelectedIndex(4);
    }//GEN-LAST:event_EnfermeriaMouseClicked

    private void EnfermeriaMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_EnfermeriaMouseMoved
    {//GEN-HEADEREND:event_EnfermeriaMouseMoved
        Enfermeria.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_EnfermeriaMouseMoved

    private void EnfermeriaMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_EnfermeriaMouseExited
    {//GEN-HEADEREND:event_EnfermeriaMouseExited
        Enfermeria.setBackground(new Color(0, 153, 255));
    }//GEN-LAST:event_EnfermeriaMouseExited

    private void PanelVerMasMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_PanelVerMasMouseClicked
    {//GEN-HEADEREND:event_PanelVerMasMouseClicked
        TablaOpciones.setSelectedIndex(1);
    }//GEN-LAST:event_PanelVerMasMouseClicked

    private void PanelVerMasMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_PanelVerMasMouseMoved
    {//GEN-HEADEREND:event_PanelVerMasMouseMoved
        PanelVerMas.setBackground(new Color(255,255,51));
    }//GEN-LAST:event_PanelVerMasMouseMoved

    private void PanelVerMasMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_PanelVerMasMouseExited
    {//GEN-HEADEREND:event_PanelVerMasMouseExited
        PanelVerMas.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_PanelVerMasMouseExited

    private void PanelVerMas2MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_PanelVerMas2MouseClicked
    {//GEN-HEADEREND:event_PanelVerMas2MouseClicked
        TablaOpciones.setSelectedIndex(2);
    }//GEN-LAST:event_PanelVerMas2MouseClicked

    private void PanelVerMas2MouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_PanelVerMas2MouseMoved
    {//GEN-HEADEREND:event_PanelVerMas2MouseMoved
        PanelVerMas2.setBackground(new Color(0,153,255));
    }//GEN-LAST:event_PanelVerMas2MouseMoved

    private void PanelVerMas2MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_PanelVerMas2MouseExited
    {//GEN-HEADEREND:event_PanelVerMas2MouseExited
        PanelVerMas2.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_PanelVerMas2MouseExited

    private void PanelVerMas3MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_PanelVerMas3MouseClicked
    {//GEN-HEADEREND:event_PanelVerMas3MouseClicked
        TablaOpciones.setSelectedIndex(3);
    }//GEN-LAST:event_PanelVerMas3MouseClicked

    private void PanelVerMas3MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_PanelVerMas3MouseExited
    {//GEN-HEADEREND:event_PanelVerMas3MouseExited
        PanelVerMas3.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_PanelVerMas3MouseExited

    private void PanelVerMas3MouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_PanelVerMas3MouseMoved
    {//GEN-HEADEREND:event_PanelVerMas3MouseMoved
        PanelVerMas3.setBackground(new Color(0,204,153));
    }//GEN-LAST:event_PanelVerMas3MouseMoved

    private void PanelVerMas4MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_PanelVerMas4MouseClicked
    {//GEN-HEADEREND:event_PanelVerMas4MouseClicked
        TablaOpciones.setSelectedIndex(4);
    }//GEN-LAST:event_PanelVerMas4MouseClicked

    private void PanelVerMas4MouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_PanelVerMas4MouseMoved
    {//GEN-HEADEREND:event_PanelVerMas4MouseMoved
        PanelVerMas4.setBackground(new Color(255,51,51));
    }//GEN-LAST:event_PanelVerMas4MouseMoved

    private void PanelVerMas4MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_PanelVerMas4MouseExited
    {//GEN-HEADEREND:event_PanelVerMas4MouseExited
        PanelVerMas4.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_PanelVerMas4MouseExited

    private void CuadroRNAMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroRNAMouseClicked
    {//GEN-HEADEREND:event_CuadroRNAMouseClicked
        TablaAlumno.setSelectedIndex(1);
    }//GEN-LAST:event_CuadroRNAMouseClicked

    private void CuadroRNAMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroRNAMouseMoved
    {//GEN-HEADEREND:event_CuadroRNAMouseMoved
        CuadroRNA.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_CuadroRNAMouseMoved

    private void CuadroRNAMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroRNAMouseExited
    {//GEN-HEADEREND:event_CuadroRNAMouseExited
        CuadroRNA.setBackground(new Color(0,153,255));
    }//GEN-LAST:event_CuadroRNAMouseExited

    private void CuadroMAMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroMAMouseClicked
    {//GEN-HEADEREND:event_CuadroMAMouseClicked
        TablaAlumno.setSelectedIndex(2);
    }//GEN-LAST:event_CuadroMAMouseClicked

    private void CuadroMAMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroMAMouseMoved
    {//GEN-HEADEREND:event_CuadroMAMouseMoved
        CuadroMA.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_CuadroMAMouseMoved

    private void CuadroMAMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroMAMouseExited
    {//GEN-HEADEREND:event_CuadroMAMouseExited
        CuadroMA.setBackground(new Color(0,153,255));
    }//GEN-LAST:event_CuadroMAMouseExited

    private void CuadroCAMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroCAMouseClicked
    {//GEN-HEADEREND:event_CuadroCAMouseClicked
        TablaAlumno.setSelectedIndex(3);
    }//GEN-LAST:event_CuadroCAMouseClicked

    private void CuadroCAMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroCAMouseMoved
    {//GEN-HEADEREND:event_CuadroCAMouseMoved
        CuadroCA.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_CuadroCAMouseMoved

    private void CuadroCAMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroCAMouseExited
    {//GEN-HEADEREND:event_CuadroCAMouseExited
        CuadroCA.setBackground(new Color(0,153,255));
    }//GEN-LAST:event_CuadroCAMouseExited

    private void CuadroRIAMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroRIAMouseClicked
    {//GEN-HEADEREND:event_CuadroRIAMouseClicked
        TablaAlumno.setSelectedIndex(4);
    }//GEN-LAST:event_CuadroRIAMouseClicked

    private void CuadroRIAMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroRIAMouseMoved
    {//GEN-HEADEREND:event_CuadroRIAMouseMoved
        CuadroRIA.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_CuadroRIAMouseMoved

    private void CuadroRIAMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroRIAMouseExited
    {//GEN-HEADEREND:event_CuadroRIAMouseExited
        CuadroRIA.setBackground(new Color(0,153,255));
    }//GEN-LAST:event_CuadroRIAMouseExited

    private void CuadroSalirAlMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirAlMouseClicked
    {//GEN-HEADEREND:event_CuadroSalirAlMouseClicked
        TablaOpciones.setSelectedIndex(0);
    }//GEN-LAST:event_CuadroSalirAlMouseClicked

    private void CuadroSalirAlMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirAlMouseExited
    {//GEN-HEADEREND:event_CuadroSalirAlMouseExited
        CuadroSalirAl.setBackground(new Color(0,153,255));
    }//GEN-LAST:event_CuadroSalirAlMouseExited

    private void CuadroSalirAlMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirAlMouseMoved
    {//GEN-HEADEREND:event_CuadroSalirAlMouseMoved
        CuadroSalirAl.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_CuadroSalirAlMouseMoved

    private void CuadroSalirFunMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirFunMouseClicked
    {//GEN-HEADEREND:event_CuadroSalirFunMouseClicked
        TablaOpciones.setSelectedIndex(0);
    }//GEN-LAST:event_CuadroSalirFunMouseClicked

    private void CuadroSalirFunMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirFunMouseMoved
    {//GEN-HEADEREND:event_CuadroSalirFunMouseMoved
        CuadroSalirFun.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_CuadroSalirFunMouseMoved

    private void CuadroSalirFunMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirFunMouseExited
    {//GEN-HEADEREND:event_CuadroSalirFunMouseExited
        CuadroSalirFun.setBackground(new Color(255,255,51));
    }//GEN-LAST:event_CuadroSalirFunMouseExited

    private void CuadroSalirRNAMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirRNAMouseClicked
    {//GEN-HEADEREND:event_CuadroSalirRNAMouseClicked
        TablaAlumno.setSelectedIndex(0);
    }//GEN-LAST:event_CuadroSalirRNAMouseClicked

    private void CuadroSalirRNAMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirRNAMouseMoved
    {//GEN-HEADEREND:event_CuadroSalirRNAMouseMoved
        CuadroSalirRNA.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_CuadroSalirRNAMouseMoved

    private void CuadroSalirRNAMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirRNAMouseExited
    {//GEN-HEADEREND:event_CuadroSalirRNAMouseExited
        CuadroSalirRNA.setBackground(new Color(0,153,255));
    }//GEN-LAST:event_CuadroSalirRNAMouseExited

    private void CuadroSalirCAMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirCAMouseClicked
    {//GEN-HEADEREND:event_CuadroSalirCAMouseClicked
        TablaAlumno.setSelectedIndex(0);
    }//GEN-LAST:event_CuadroSalirCAMouseClicked

    private void CuadroSalirCAMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirCAMouseMoved
    {//GEN-HEADEREND:event_CuadroSalirCAMouseMoved
        CuadroSalirCA.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_CuadroSalirCAMouseMoved

    private void CuadroSalirCAMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirCAMouseExited
    {//GEN-HEADEREND:event_CuadroSalirCAMouseExited
        CuadroSalirCA.setBackground(new Color(0,153,255));
    }//GEN-LAST:event_CuadroSalirCAMouseExited

    private void CuadroSalirRIAMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirRIAMouseClicked
    {//GEN-HEADEREND:event_CuadroSalirRIAMouseClicked
        TablaAlumno.setSelectedIndex(0);
    }//GEN-LAST:event_CuadroSalirRIAMouseClicked

    private void CuadroSalirRIAMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirRIAMouseMoved
    {//GEN-HEADEREND:event_CuadroSalirRIAMouseMoved
        CuadroSalirRIA.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_CuadroSalirRIAMouseMoved

    private void CuadroSalirRIAMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirRIAMouseExited
    {//GEN-HEADEREND:event_CuadroSalirRIAMouseExited
        CuadroSalirRIA.setBackground(new Color(0,153,255));
    }//GEN-LAST:event_CuadroSalirRIAMouseExited

    private void CuadroRNPMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroRNPMouseClicked
    {//GEN-HEADEREND:event_CuadroRNPMouseClicked
        TablaPersonal.setSelectedIndex(1);
    }//GEN-LAST:event_CuadroRNPMouseClicked

    private void CuadroRNPMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroRNPMouseMoved
    {//GEN-HEADEREND:event_CuadroRNPMouseMoved
        CuadroRNP.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_CuadroRNPMouseMoved

    private void CuadroRNPMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroRNPMouseExited
    {//GEN-HEADEREND:event_CuadroRNPMouseExited
        CuadroRNP.setBackground(new Color(0,204,153));
    }//GEN-LAST:event_CuadroRNPMouseExited

    private void CuadroMPMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroMPMouseClicked
    {//GEN-HEADEREND:event_CuadroMPMouseClicked
        TablaPersonal.setSelectedIndex(2);
    }//GEN-LAST:event_CuadroMPMouseClicked

    private void CuadroMPMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroMPMouseMoved
    {//GEN-HEADEREND:event_CuadroMPMouseMoved
        CuadroMP.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_CuadroMPMouseMoved

    private void CuadroMPMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroMPMouseExited
    {//GEN-HEADEREND:event_CuadroMPMouseExited
        CuadroMP.setBackground(new Color(0,204,153));
    }//GEN-LAST:event_CuadroMPMouseExited

    private void CuadroCPMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroCPMouseClicked
    {//GEN-HEADEREND:event_CuadroCPMouseClicked
        TablaPersonal.setSelectedIndex(3);
    }//GEN-LAST:event_CuadroCPMouseClicked

    private void CuadroCPMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroCPMouseMoved
    {//GEN-HEADEREND:event_CuadroCPMouseMoved
        CuadroCP.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_CuadroCPMouseMoved

    private void CuadroCPMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroCPMouseExited
    {//GEN-HEADEREND:event_CuadroCPMouseExited
        CuadroCP.setBackground(new Color(0,204,153));
    }//GEN-LAST:event_CuadroCPMouseExited

    private void CuadroRIPMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroRIPMouseClicked
    {//GEN-HEADEREND:event_CuadroRIPMouseClicked
        TablaPersonal.setSelectedIndex(4);
    }//GEN-LAST:event_CuadroRIPMouseClicked

    private void CuadroRIPMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroRIPMouseMoved
    {//GEN-HEADEREND:event_CuadroRIPMouseMoved
        CuadroRIP.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_CuadroRIPMouseMoved

    private void CuadroRIPMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroRIPMouseExited
    {//GEN-HEADEREND:event_CuadroRIPMouseExited
        CuadroRIP.setBackground(new Color(0,204,153));
    }//GEN-LAST:event_CuadroRIPMouseExited

    private void CuadroSalirPMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirPMouseClicked
    {//GEN-HEADEREND:event_CuadroSalirPMouseClicked
        TablaOpciones.setSelectedIndex(0);
    }//GEN-LAST:event_CuadroSalirPMouseClicked

    private void CuadroSalirPMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirPMouseMoved
    {//GEN-HEADEREND:event_CuadroSalirPMouseMoved
        CuadroSalirP.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_CuadroSalirPMouseMoved

    private void CuadroSalirPMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirPMouseExited
    {//GEN-HEADEREND:event_CuadroSalirPMouseExited
        CuadroSalirP.setBackground(new Color(0,204,153));
    }//GEN-LAST:event_CuadroSalirPMouseExited

    private void CuadroSalirMPerMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirMPerMouseClicked
    {//GEN-HEADEREND:event_CuadroSalirMPerMouseClicked
        TablaPersonal.setSelectedIndex(0);
    }//GEN-LAST:event_CuadroSalirMPerMouseClicked

    private void TablaPersonalMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_TablaPersonalMouseClicked
    {//GEN-HEADEREND:event_TablaPersonalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TablaPersonalMouseClicked

    private void CuadroSalirMPerMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirMPerMouseMoved
    {//GEN-HEADEREND:event_CuadroSalirMPerMouseMoved
        CuadroSalirMPer.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_CuadroSalirMPerMouseMoved

    private void CuadroSalirMPerMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirMPerMouseExited
    {//GEN-HEADEREND:event_CuadroSalirMPerMouseExited
        CuadroSalirMPer.setBackground(new Color(0,204,153));
    }//GEN-LAST:event_CuadroSalirMPerMouseExited

    private void CuadroSalirCPerMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirCPerMouseClicked
    {//GEN-HEADEREND:event_CuadroSalirCPerMouseClicked
        TablaPersonal.setSelectedIndex(0);
    }//GEN-LAST:event_CuadroSalirCPerMouseClicked

    private void CuadroSalirCPerMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirCPerMouseMoved
    {//GEN-HEADEREND:event_CuadroSalirCPerMouseMoved
        CuadroSalirCPer.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_CuadroSalirCPerMouseMoved

    private void CuadroSalirCPerMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirCPerMouseExited
    {//GEN-HEADEREND:event_CuadroSalirCPerMouseExited
        CuadroSalirCPer.setBackground(new Color(0,204,153));
    }//GEN-LAST:event_CuadroSalirCPerMouseExited

    private void CuadroSalirRIPerMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirRIPerMouseClicked
    {//GEN-HEADEREND:event_CuadroSalirRIPerMouseClicked
        TablaPersonal.setSelectedIndex(0);
    }//GEN-LAST:event_CuadroSalirRIPerMouseClicked

    private void CuadroSalirRIPerMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirRIPerMouseMoved
    {//GEN-HEADEREND:event_CuadroSalirRIPerMouseMoved
        CuadroSalirRIPer.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_CuadroSalirRIPerMouseMoved

    private void CuadroSalirRIPerMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirRIPerMouseExited
    {//GEN-HEADEREND:event_CuadroSalirRIPerMouseExited
        CuadroSalirRIPer.setBackground(new Color(0,204,153));
    }//GEN-LAST:event_CuadroSalirRIPerMouseExited

    private void nombreActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_nombreActionPerformed
    {//GEN-HEADEREND:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void primerApActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_primerApActionPerformed
    {//GEN-HEADEREND:event_primerApActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_primerApActionPerformed

    private void otrasenfermedadesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_otrasenfermedadesActionPerformed
    {//GEN-HEADEREND:event_otrasenfermedadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_otrasenfermedadesActionPerformed

    private void cveRAlumActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cveRAlumActionPerformed
    {//GEN-HEADEREND:event_cveRAlumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cveRAlumActionPerformed

    private void BotonAceptarAlumActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BotonAceptarAlumActionPerformed
    {//GEN-HEADEREND:event_BotonAceptarAlumActionPerformed
        try
        {
            if (!validarComboBoxesA())
            {
                Mensajes.error(this, "Campos por llenar");
            } else
            {
                if (!validarCajasTextoA())
                {
                    Mensajes.error(this, "Campos por completar");
                } else
                {

                    if (Menu.buscar(menu.a, cveRAlum.getText()) == -1)
                    {
                        String carrera = (String) ComboBoxCarreraA1.getSelectedItem();
                        char f = carrera.charAt(0);
                        String vive = (String) ComboBoxViveConA1.getSelectedItem();
                        char g = vive.charAt(0);
                        menu.a = Menu.inserta(menu.a, new Alumnos(
                                Character.getNumericValue(f),
                                Character.getNumericValue(g),
                                cveRAlum.getText(),
                                nombre.getText(),
                                primerAp.getText(),
                                segundoAp.getText(),
                                ((String) ComboBoxSexoA1.getSelectedItem()).charAt(0),
                                convertirComboBoxABoolean(ComboBoxDesnutricionA1),
                                convertirComboBoxABoolean(ComboBoxSobrepesoA),
                                convertirComboBoxABoolean(ComboBoxAlergiasA),
                                convertirComboBoxABoolean(ComboBoxObesidadA),
                                convertirComboBoxABoolean(ComboBoxDiabetesA),
                                otrasenfermedades.getText()
                        ));

                        Mensajes.exito(this, "Alumno registrado satisfactioriamente");

                    } else
                    {

                        Mensajes.error(this, "Alumno existente");
                        BotonCancelarAlumActionPerformed(evt);

                    }

                }
                resetearComboBoxesA();
            }

        } catch (NumberFormatException e)
        {
            Mensajes.error(this, "Error de formato: Ingresa un número válido." + e.getMessage());
        } catch (Exception a)
        {
            Mensajes.error(this, " excepción específica: " + a.getMessage());
        }


    }//GEN-LAST:event_BotonAceptarAlumActionPerformed

    private void ComboBoxSexoA1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ComboBoxSexoA1ActionPerformed
    {//GEN-HEADEREND:event_ComboBoxSexoA1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxSexoA1ActionPerformed

    private void ComboBoxSexoA1ItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_ComboBoxSexoA1ItemStateChanged
    {//GEN-HEADEREND:event_ComboBoxSexoA1ItemStateChanged
        CtrlInterfaz.cambia(ComboBoxDesnutricionA1);
    }//GEN-LAST:event_ComboBoxSexoA1ItemStateChanged

    private void ComboBoxDesnutricionA1ItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_ComboBoxDesnutricionA1ItemStateChanged
    {//GEN-HEADEREND:event_ComboBoxDesnutricionA1ItemStateChanged
        CtrlInterfaz.cambia(ComboBoxAlergiasA);
    }//GEN-LAST:event_ComboBoxDesnutricionA1ItemStateChanged

    private void ComboBoxViveConA1ItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_ComboBoxViveConA1ItemStateChanged
    {//GEN-HEADEREND:event_ComboBoxViveConA1ItemStateChanged
        CtrlInterfaz.cambia(ComboBoxCarreraA1);
    }//GEN-LAST:event_ComboBoxViveConA1ItemStateChanged

    private void CuadroCAluAncestorMoved(javax.swing.event.AncestorEvent evt)//GEN-FIRST:event_CuadroCAluAncestorMoved
    {//GEN-HEADEREND:event_CuadroCAluAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_CuadroCAluAncestorMoved

    private void CuadroCAluAncestorAdded(javax.swing.event.AncestorEvent evt)//GEN-FIRST:event_CuadroCAluAncestorAdded
    {//GEN-HEADEREND:event_CuadroCAluAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_CuadroCAluAncestorAdded

    private void BotonCancelarPerActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BotonCancelarPerActionPerformed
    {//GEN-HEADEREND:event_BotonCancelarPerActionPerformed
        CtrlInterfaz.limpia(nombrePer, primerApPer, segundoApPer, cvePer);
        CtrlInterfaz.habilita(false, nombrePer, primerApPer, segundoApPer,
                ComboBoxSexoP1, ComboBoxDesnutricionP1, ComboBoxAlergiasP1, ComboBoxObesidadP1,
                ComboBoxSobrepesoP1, ComboBoxDiabetesP1, oEnferPer, ComboBoxEstatusP1);
        CtrlInterfaz.cambia(cvePer);
    }//GEN-LAST:event_BotonCancelarPerActionPerformed

    private void BotonAceptarRNPActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BotonAceptarRNPActionPerformed
    {//GEN-HEADEREND:event_BotonAceptarRNPActionPerformed
        try
        {
            if (Menu.buscar(menu.a, cvePer.getText()) == -1)
            {
                menu.a = Menu.inserta(menu.a, new Personal(((String) ComboBoxEstatusP1.getSelectedItem()).charAt(4), cvePer.getText(),
                        nombrePer.getText(), primerApPer.getText(), segundoApPer.getText(),
                        ((String) ComboBoxSexoP1.getSelectedItem()).charAt(0),
                        convertirComboBoxABoolean(ComboBoxDesnutricionP1),
                        convertirComboBoxABoolean(ComboBoxSobrepesoP1),
                        convertirComboBoxABoolean(ComboBoxAlergiasP1),
                        convertirComboBoxABoolean(ComboBoxObesidadP1),
                        convertirComboBoxABoolean(ComboBoxDiabetesP1),
                        oEnferPer.getText()));
                Mensajes.exito(this, "Personal Registardo Satisfactoriamente");

            } else
            {
                Mensajes.error(this, "Personal Existente");
            }
            BotonCancelarPerActionPerformed(evt);
        } catch (NumberFormatException e)
        {
            Mensajes.error(this, "Error de formato: Ingresa un número válido." + e.getMessage());
        } catch (Exception a)
        {
            Mensajes.error(this, " excepción específica: " + a.getMessage());
        }

    }//GEN-LAST:event_BotonAceptarRNPActionPerformed

    private void CuadroSalirRNPerMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirRNPerMouseExited
    {//GEN-HEADEREND:event_CuadroSalirRNPerMouseExited
        CuadroSalirRNPer.setBackground(new Color(0,204,153));
    }//GEN-LAST:event_CuadroSalirRNPerMouseExited

    private void CuadroSalirRNPerMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirRNPerMouseClicked
    {//GEN-HEADEREND:event_CuadroSalirRNPerMouseClicked
        TablaPersonal.setSelectedIndex(0);
    }//GEN-LAST:event_CuadroSalirRNPerMouseClicked

    private void CuadroSalirRNPerMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirRNPerMouseMoved
    {//GEN-HEADEREND:event_CuadroSalirRNPerMouseMoved
        CuadroSalirRNPer.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_CuadroSalirRNPerMouseMoved

    private void ComboBoxSexoP1ItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_ComboBoxSexoP1ItemStateChanged
    {//GEN-HEADEREND:event_ComboBoxSexoP1ItemStateChanged
        CtrlInterfaz.cambia(ComboBoxDesnutricionP1);
    }//GEN-LAST:event_ComboBoxSexoP1ItemStateChanged

    private void ComboBoxSexoP1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ComboBoxSexoP1ActionPerformed
    {//GEN-HEADEREND:event_ComboBoxSexoP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxSexoP1ActionPerformed

    private void ComboBoxDesnutricionP1ItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_ComboBoxDesnutricionP1ItemStateChanged
    {//GEN-HEADEREND:event_ComboBoxDesnutricionP1ItemStateChanged
        CtrlInterfaz.cambia(ComboBoxAlergiasP1);
    }//GEN-LAST:event_ComboBoxDesnutricionP1ItemStateChanged

    private void ComboBoxAlergiasP1ItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_ComboBoxAlergiasP1ItemStateChanged
    {//GEN-HEADEREND:event_ComboBoxAlergiasP1ItemStateChanged
        CtrlInterfaz.cambia(ComboBoxObesidadP1);
    }//GEN-LAST:event_ComboBoxAlergiasP1ItemStateChanged

    private void ComboBoxEstatusP1ItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_ComboBoxEstatusP1ItemStateChanged
    {//GEN-HEADEREND:event_ComboBoxEstatusP1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxEstatusP1ItemStateChanged

    private void ComboBoxObesidadP1ItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_ComboBoxObesidadP1ItemStateChanged
    {//GEN-HEADEREND:event_ComboBoxObesidadP1ItemStateChanged
        CtrlInterfaz.cambia(ComboBoxSobrepesoP1);
    }//GEN-LAST:event_ComboBoxObesidadP1ItemStateChanged

    private void ComboBoxSobrepesoP1ItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_ComboBoxSobrepesoP1ItemStateChanged
    {//GEN-HEADEREND:event_ComboBoxSobrepesoP1ItemStateChanged
        CtrlInterfaz.cambia(ComboBoxDiabetesP1);
    }//GEN-LAST:event_ComboBoxSobrepesoP1ItemStateChanged

    private void ComboBoxDiabetesP1ItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_ComboBoxDiabetesP1ItemStateChanged
    {//GEN-HEADEREND:event_ComboBoxDiabetesP1ItemStateChanged
        CtrlInterfaz.cambia(oEnferPer);
    }//GEN-LAST:event_ComboBoxDiabetesP1ItemStateChanged

    private void BotonCancelarAlumActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BotonCancelarAlumActionPerformed
    {//GEN-HEADEREND:event_BotonCancelarAlumActionPerformed
        resetearComboBoxesA();
        CtrlInterfaz.limpia(cveRAlum, nombre, primerAp, segundoAp, otrasenfermedades);
        CtrlInterfaz.cambia(cveRAlum);
    }//GEN-LAST:event_BotonCancelarAlumActionPerformed

    private void nombreKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_nombreKeyTyped
    {//GEN-HEADEREND:event_nombreKeyTyped
        Validaciones.validaAlfabeticos(evt, 15, nombre.getText());
    }//GEN-LAST:event_nombreKeyTyped

    private void nombreKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_nombreKeyPressed
    {//GEN-HEADEREND:event_nombreKeyPressed
        Validaciones.enterCadenaNoVacia(this, evt, nombre, primerAp);
    }//GEN-LAST:event_nombreKeyPressed

    private void primerApKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_primerApKeyPressed
    {//GEN-HEADEREND:event_primerApKeyPressed
        Validaciones.enterCadenaNoVacia(this, evt, primerAp, segundoAp);
    }//GEN-LAST:event_primerApKeyPressed

    private void otrasenfermedadesKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_otrasenfermedadesKeyPressed
    {//GEN-HEADEREND:event_otrasenfermedadesKeyPressed
        Validaciones.enterCadenaNoVacia(this, evt, otrasenfermedades, cveRAlum);
    }//GEN-LAST:event_otrasenfermedadesKeyPressed

    private void nombrePerKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_nombrePerKeyPressed
    {//GEN-HEADEREND:event_nombrePerKeyPressed
        Validaciones.enterCadenaNoVacia(this, evt, nombrePer, primerApPer);
    }//GEN-LAST:event_nombrePerKeyPressed

    private void primerApPerKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_primerApPerKeyPressed
    {//GEN-HEADEREND:event_primerApPerKeyPressed
        Validaciones.enterCadenaNoVacia(this, evt, primerApPer, segundoApPer);
    }//GEN-LAST:event_primerApPerKeyPressed

    private void segundoApPerKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_segundoApPerKeyPressed
    {//GEN-HEADEREND:event_segundoApPerKeyPressed
        Validaciones.enterCadenaNoVacia(this, evt, segundoApPer, oEnferPer);
    }//GEN-LAST:event_segundoApPerKeyPressed

    private void oEnferPerKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_oEnferPerKeyPressed
    {//GEN-HEADEREND:event_oEnferPerKeyPressed
        Validaciones.enterCadenaNoVacia(this, evt, oEnferPer, cvePer);
    }//GEN-LAST:event_oEnferPerKeyPressed

    private void ComboBoxDiabetesP1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ComboBoxDiabetesP1ActionPerformed
    {//GEN-HEADEREND:event_ComboBoxDiabetesP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxDiabetesP1ActionPerformed

    private void ComboBoxAlergiasP1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ComboBoxAlergiasP1ActionPerformed
    {//GEN-HEADEREND:event_ComboBoxAlergiasP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxAlergiasP1ActionPerformed

    private void cvePerKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_cvePerKeyPressed
    {//GEN-HEADEREND:event_cvePerKeyPressed
        if (evt.getKeyChar() == '\n')
        {
            if (Menu.buscar(menu.a, cvePer.getText()) != -1)
            {

                Mensajes.error(this, "Número de Personal existente");

                BotonCancelarModAActionPerformed(null);
            }
        } else
        {
            Validaciones.enterCadenaNoVacia(this, evt, cvePer, nombrePer);
        }

    }//GEN-LAST:event_cvePerKeyPressed

    private void cvePerKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_cvePerKeyTyped
    {//GEN-HEADEREND:event_cvePerKeyTyped

        Validaciones.validaEntero(evt, 9, cvePer.getText());
    }//GEN-LAST:event_cvePerKeyTyped

    private void nombrePerKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_nombrePerKeyTyped
    {//GEN-HEADEREND:event_nombrePerKeyTyped
        Validaciones.validaAlfabeticos(evt, 15, nombrePer.getText());
    }//GEN-LAST:event_nombrePerKeyTyped

    private void primerApPerKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_primerApPerKeyTyped
    {//GEN-HEADEREND:event_primerApPerKeyTyped
        Validaciones.validaAlfabeticos(evt, 15, primerApPer.getText());
    }//GEN-LAST:event_primerApPerKeyTyped

    private void segundoApPerKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_segundoApPerKeyTyped
    {//GEN-HEADEREND:event_segundoApPerKeyTyped
        Validaciones.validaAlfabeticos(evt, 15, segundoApPer.getText());
    }//GEN-LAST:event_segundoApPerKeyTyped

    private void oEnferPerKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_oEnferPerKeyTyped
    {//GEN-HEADEREND:event_oEnferPerKeyTyped
        Validaciones.validaAlfabeticos(evt, 15, oEnferPer.getText());
    }//GEN-LAST:event_oEnferPerKeyTyped

    private void primerApKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_primerApKeyTyped
    {//GEN-HEADEREND:event_primerApKeyTyped
        Validaciones.validaAlfabeticos(evt, 15, primerAp.getText());
    }//GEN-LAST:event_primerApKeyTyped

    private void segundoApKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_segundoApKeyTyped
    {//GEN-HEADEREND:event_segundoApKeyTyped
        Validaciones.validaAlfabeticos(evt, 15, segundoAp.getText());
    }//GEN-LAST:event_segundoApKeyTyped

    private void otrasenfermedadesKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_otrasenfermedadesKeyTyped
    {//GEN-HEADEREND:event_otrasenfermedadesKeyTyped
        Validaciones.validaAlfabeticos(evt, 15, otrasenfermedades.getText());
    }//GEN-LAST:event_otrasenfermedadesKeyTyped

    private void cveRAlumKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_cveRAlumKeyTyped
    {//GEN-HEADEREND:event_cveRAlumKeyTyped
        Validaciones.validaEntero(evt, 9, cveRAlum.getText());
    }//GEN-LAST:event_cveRAlumKeyTyped

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jPanel1MousePressed
    {//GEN-HEADEREND:event_jPanel1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jPanel1MouseDragged
    {//GEN-HEADEREND:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void CierreCompletoMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CierreCompletoMouseClicked
    {//GEN-HEADEREND:event_CierreCompletoMouseClicked
        ManipulacionArchivos.guarda(
                "../DatosI/alumnos.dat", a);
        ManipulacionArchivos.guarda(
                "../DatosI/personal.dat", p);
        ManipulacionArchivos.guardaMat("../DatosIM/HC.dat", H);
        System.exit(0);
    }//GEN-LAST:event_CierreCompletoMouseClicked

    private void CierreCompletoMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CierreCompletoMouseEntered
    {//GEN-HEADEREND:event_CierreCompletoMouseEntered
        CierreCompleto.setBackground(Color.red);
    }//GEN-LAST:event_CierreCompletoMouseEntered

    private void cvePer1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cvePer1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cvePer1KeyPressed

    private void cvePer1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cvePer1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cvePer1KeyTyped

    private void ComboBoxSexoModPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboBoxSexoModPItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxSexoModPItemStateChanged

    private void ComboBoxSexoModPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxSexoModPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxSexoModPActionPerformed

    private void ComboBoxDesnutrucionModPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboBoxDesnutrucionModPItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxDesnutrucionModPItemStateChanged

    private void ComboBoxSobrepesoModPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboBoxSobrepesoModPItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxSobrepesoModPItemStateChanged

    private void ComboBoxAlergiasModPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboBoxAlergiasModPItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxAlergiasModPItemStateChanged

    private void ComboBoxAlergiasModPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxAlergiasModPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxAlergiasModPActionPerformed

    private void ComboBoxObesidadModPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboBoxObesidadModPItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxObesidadModPItemStateChanged

    private void ComboBoxDiabetesModPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboBoxDiabetesModPItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxDiabetesModPItemStateChanged

    private void ComboBoxDiabetesModPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxDiabetesModPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxDiabetesModPActionPerformed

    private void oEnferModPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_oEnferModPKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_oEnferModPKeyPressed

    private void oEnferModPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_oEnferModPKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_oEnferModPKeyTyped

    private void ComboBoxEstatusP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxEstatusP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxEstatusP1ActionPerformed

    private void BotonAceptarRNP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAceptarRNP1ActionPerformed
        try
        {
            if (!validarComboBoxesP())
            {
                Mensajes.error(this, "Campos por completar");
            } else
            {
                if (!validarCajasTextoP())
                {
                    Mensajes.error(this, "Campos por completar");
                } else
                {
                    int z = Menu.buscar(menu.a, cvePer.getText());
                    if (z != -1)
                    {
                        char estatus = ((String) ComboBoxEstatusModP.getSelectedItem()).charAt(0);
                        char sexo = ((String) ComboBoxSexoModP.getSelectedItem()).charAt(0);
                        Personal personalModificado = new Personal(estatus, sexo,
                                convertirComboBoxABoolean(ComboBoxDesnutrucionModP),
                                convertirComboBoxABoolean(ComboBoxSobrepesoModP),
                                convertirComboBoxABoolean(ComboBoxAlergiasModP),
                                convertirComboBoxABoolean(ComboBoxAlergiasModP),
                                convertirComboBoxABoolean(ComboBoxDiabetesModP), oEnferModP.getText());
                        Menu.modificaciones(a, z, null, personalModificado);
                        menu.a[z] = personalModificado;
                        Mensajes.exito(this, "Modificación exitosa");
                    }
                    BotonCancelarModPActionPerformed(null);
                }
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_BotonAceptarRNP1ActionPerformed

    private void BotonCancelarModPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarModPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonCancelarModPActionPerformed

    private void ComboBoxEstatusModPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboBoxEstatusModPItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxEstatusModPItemStateChanged

    private void ComboBoxEstatusModPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxEstatusModPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxEstatusModPActionPerformed

    private void CuadroSalirMAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CuadroSalirMAMouseExited
        CuadroSalirMA.setBackground(new Color(0,153,255));
    }//GEN-LAST:event_CuadroSalirMAMouseExited

    private void CuadroSalirMAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CuadroSalirMAMouseClicked
        TablaAlumno.setSelectedIndex(0);
    }//GEN-LAST:event_CuadroSalirMAMouseClicked

    private void CuadroSalirMAMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CuadroSalirMAMouseMoved
        CuadroSalirMA.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_CuadroSalirMAMouseMoved

    private void ComboBoxCarreraModAItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboBoxCarreraModAItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxCarreraModAItemStateChanged

    private void ComboBoxCarreraModAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxCarreraModAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxCarreraModAActionPerformed

    private void ComboBoxSexoModAItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboBoxSexoModAItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxSexoModAItemStateChanged

    private void ComboBoxSexoModAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxSexoModAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxSexoModAActionPerformed

    private void ComboBoxDesnutricionModAItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboBoxDesnutricionModAItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxDesnutricionModAItemStateChanged

    private void cveModAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cveModAKeyPressed
        if (evt.getKeyChar() == '\n')
        {
            if (Menu.buscar(menu.a, cveRAlum.getText()) == -1)
            {
                Mensajes.error(this, "Matrícula no encontrada");
                BotonCancelarModAActionPerformed(null);
            }
        } else
        {
            Validaciones.enterCadenaNoVacia(this, evt, cveRAlum, ComboBoxSexoModA);
        }
    }//GEN-LAST:event_cveModAKeyPressed

    private void cveModAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cveModAKeyTyped
        Validaciones.validaEntero(evt, 9, cveModA.getText());
    }//GEN-LAST:event_cveModAKeyTyped

    private void oEnferModAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_oEnferModAKeyPressed

        Validaciones.enterCadenaNoVacia(this, evt, oEnferModA, ComboBoxViveModA);
    }//GEN-LAST:event_oEnferModAKeyPressed

    private void oEnferModAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_oEnferModAKeyTyped
        Validaciones.validaAlfabeticos(evt, 20, oEnferModA.getText());
    }//GEN-LAST:event_oEnferModAKeyTyped

    private void BotonAceptarModAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAceptarModAActionPerformed
        try
        {
            if (!validarComboBoxesA())
            {
                Mensajes.error(this, "Campos por completar");

            } else
            {
                if (!validarCajasTextoA())
                {
                    Mensajes.error(this, "Campos por completar");

                } else
                {
                    int x = Menu.buscar(menu.a, cveModA.getText());
                    if (x != -1)
                    {

                        String carrera = (String) ComboBoxCarreraModA.getSelectedItem();
                        char f = carrera.charAt(0);
                        String vive = (String) ComboBoxViveModA.getSelectedItem();
                        char g = vive.charAt(0);

                        // Modificación para Alumnos
                        Alumnos alumnoModificado = new Alumnos(Character.getNumericValue(f),
                                Character.getNumericValue(g),
                                ((String) ComboBoxSexoModA.getSelectedItem()).charAt(0),
                                convertirComboBoxABoolean(ComboBoxDesnutricionModA),
                                convertirComboBoxABoolean(ComboBoxSobrepesoModA),
                                convertirComboBoxABoolean(ComboBoxAlergiasModA),
                                convertirComboBoxABoolean(ComboBoxObesidadModA),
                                convertirComboBoxABoolean(ComboBoxDiabetesModA),
                                oEnferModA.getText());
                        Menu.modificaciones(a, x, alumnoModificado, null);
                        menu.a[x] = alumnoModificado;  // Asegúrate de actualizar el objeto en el arreglo

//                            Menu.modificaciones(a, x, alumnoModificado, null);
                        Mensajes.exito(this, "Modificación existosa");

                    }

                }
                BotonCancelarModAActionPerformed(null);
            }

        } catch (Exception e)
        {
            e.printStackTrace();
        }

    }//GEN-LAST:event_BotonAceptarModAActionPerformed

    private void BotonCancelarModAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarModAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonCancelarModAActionPerformed

    private void ComboBoxViveModAItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboBoxViveModAItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxViveModAItemStateChanged

    private void ComboBoxViveModAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxViveModAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxViveModAActionPerformed

    private void ConsulAlumMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_ConsulAlumMouseEntered
    {//GEN-HEADEREND:event_ConsulAlumMouseEntered
        ConsulAlum.setText(Menu.consulta(menu.a, 1));

    }//GEN-LAST:event_ConsulAlumMouseEntered

    private void ConsulPersoMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_ConsulPersoMouseEntered
    {//GEN-HEADEREND:event_ConsulPersoMouseEntered
        ConsulPerso.setText(Menu.consulta(menu.a, 2));
    }//GEN-LAST:event_ConsulPersoMouseEntered

    private void CuadroRCCEMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroRCCEMouseClicked
    {//GEN-HEADEREND:event_CuadroRCCEMouseClicked
        TablaEnfermeria.setSelectedIndex(1);
    }//GEN-LAST:event_CuadroRCCEMouseClicked

    private void CuadroRCCEMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroRCCEMouseMoved
    {//GEN-HEADEREND:event_CuadroRCCEMouseMoved
        CuadroRCCE.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_CuadroRCCEMouseMoved

    private void CuadroRCCEMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroRCCEMouseExited
    {//GEN-HEADEREND:event_CuadroRCCEMouseExited
        CuadroRCCE.setBackground(new Color(255,51,51));
    }//GEN-LAST:event_CuadroRCCEMouseExited

    private void CuadroCAEMouseDragged(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroCAEMouseDragged
    {//GEN-HEADEREND:event_CuadroCAEMouseDragged
        TablaEnfermeria.setSelectedIndex(2);
    }//GEN-LAST:event_CuadroCAEMouseDragged

    private void CuadroCAEMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroCAEMouseMoved
    {//GEN-HEADEREND:event_CuadroCAEMouseMoved
        CuadroCAE.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_CuadroCAEMouseMoved

    private void CuadroCAEMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroCAEMouseExited
    {//GEN-HEADEREND:event_CuadroCAEMouseExited
        CuadroCAE.setBackground(new Color(255,51,51));
    }//GEN-LAST:event_CuadroCAEMouseExited

    private void CuadroCDREMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroCDREMouseClicked
    {//GEN-HEADEREND:event_CuadroCDREMouseClicked
        TablaEnfermeria.setSelectedIndex(3);
    }//GEN-LAST:event_CuadroCDREMouseClicked

    private void CuadroCDREMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroCDREMouseMoved
    {//GEN-HEADEREND:event_CuadroCDREMouseMoved
        CuadroCDRE.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_CuadroCDREMouseMoved

    private void CuadroCDREMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroCDREMouseExited
    {//GEN-HEADEREND:event_CuadroCDREMouseExited
        CuadroCDRE.setBackground(new Color(255,51,51));
    }//GEN-LAST:event_CuadroCDREMouseExited

    private void CuadroSalirEMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirEMouseClicked
    {//GEN-HEADEREND:event_CuadroSalirEMouseClicked
        TablaOpciones.setSelectedIndex(0);
    }//GEN-LAST:event_CuadroSalirEMouseClicked

    private void CuadroSalirEMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirEMouseMoved
    {//GEN-HEADEREND:event_CuadroSalirEMouseMoved
        CuadroSalirE.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_CuadroSalirEMouseMoved

    private void CuadroSalirEMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirEMouseExited
    {//GEN-HEADEREND:event_CuadroSalirEMouseExited
        CuadroSalirE.setBackground(new Color(255,51,51));
    }//GEN-LAST:event_CuadroSalirEMouseExited

    private void CuadroSalirRCCEnfMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirRCCEnfMouseClicked
    {//GEN-HEADEREND:event_CuadroSalirRCCEnfMouseClicked
        TablaEnfermeria.setSelectedIndex(0);
    }//GEN-LAST:event_CuadroSalirRCCEnfMouseClicked

    private void CuadroSalirRCCEnfMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirRCCEnfMouseExited
    {//GEN-HEADEREND:event_CuadroSalirRCCEnfMouseExited
        CuadroSalirRCCEnf.setBackground(new Color(255,51,51));
    }//GEN-LAST:event_CuadroSalirRCCEnfMouseExited

    private void CuadroSalirRCCEnfMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirRCCEnfMouseMoved
    {//GEN-HEADEREND:event_CuadroSalirRCCEnfMouseMoved
        CuadroSalirRCCEnf.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_CuadroSalirRCCEnfMouseMoved

    private void CuadroSalirCAEnfeMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirCAEnfeMouseClicked
    {//GEN-HEADEREND:event_CuadroSalirCAEnfeMouseClicked
        TablaEnfermeria.setSelectedIndex(0);
    }//GEN-LAST:event_CuadroSalirCAEnfeMouseClicked

    private void CuadroSalirCAEnfeMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirCAEnfeMouseMoved
    {//GEN-HEADEREND:event_CuadroSalirCAEnfeMouseMoved
        CuadroSalirCAEnfe.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_CuadroSalirCAEnfeMouseMoved

    private void CuadroSalirCAEnfeMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirCAEnfeMouseExited
    {//GEN-HEADEREND:event_CuadroSalirCAEnfeMouseExited
        CuadroSalirCAEnfe.setBackground(new Color(255,51,51));
    }//GEN-LAST:event_CuadroSalirCAEnfeMouseExited

    private void CuadroSalirCDREnfMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirCDREnfMouseClicked
    {//GEN-HEADEREND:event_CuadroSalirCDREnfMouseClicked
        TablaEnfermeria.setSelectedIndex(0);
    }//GEN-LAST:event_CuadroSalirCDREnfMouseClicked

    private void CuadroSalirCDREnfMouseMoved(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirCDREnfMouseMoved
    {//GEN-HEADEREND:event_CuadroSalirCDREnfMouseMoved
        CuadroSalirCDREnf.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_CuadroSalirCDREnfMouseMoved

    private void CuadroSalirCDREnfMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_CuadroSalirCDREnfMouseExited
    {//GEN-HEADEREND:event_CuadroSalirCDREnfMouseExited
        CuadroSalirCDREnf.setBackground(new Color(255,51,51));
    }//GEN-LAST:event_CuadroSalirCDREnfMouseExited

    private void PadecimientosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PadecimientosKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_PadecimientosKeyPressed

    private void PadecimientosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PadecimientosKeyTyped
        Validaciones.validaAlfabeticos(evt, 25, Padecimientos.getText());
    }//GEN-LAST:event_PadecimientosKeyTyped

    private void cveHCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cveHCKeyPressed
        if (evt.getKeyChar() == '\n')
        {
            if (Menu.buscar(menu.a, cveHC.getText()) == -1)
            {

                Mensajes.error(this, "Número de Personal no encontrado");

                BotonCancelarModAActionPerformed(null);
            }
        } else
        {
            Validaciones.enterCadenaNoVacia(this, evt, cveHC, Padecimientos);
        }
    }//GEN-LAST:event_cveHCKeyPressed

    private void cveHCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cveHCKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cveHCKeyTyped

    private void AntecedentesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AntecedentesKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_AntecedentesKeyPressed

    private void AntecedentesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AntecedentesKeyTyped
        Validaciones.validaAlfabeticos(evt, 25, Antecedentes.getText());
    }//GEN-LAST:event_AntecedentesKeyTyped

    private void planTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_planTKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_planTKeyPressed

    private void planTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_planTKeyTyped
        Validaciones.validaAlfabeticos(evt, 50, planT.getText());
    }//GEN-LAST:event_planTKeyTyped

    private void BotonAceptarRNA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAceptarRNA1ActionPerformed
        Date fechaActual = new Date();
        Date n = null;
        int h = Menu.buscar(menu.a, cveHC.getText());
        if (menu.a == null || menu.H == null || menu.H.length == 0)
        {
            Mensajes.error(this, "Sin datos");
        } else
        {
            if (Menu.buscar(menu.a, cveHC.getText()) == -1)
            {
                Mensajes.error(this, "La clave no existe");
                BotonCancelarHCActionPerformed(null);

            }
            menu.H = Menu.agregarColumna(menu.H, menu.a, cveHC.getText(), new HistorialClinico(Padecimientos.getText(),
                    Antecedentes.getText(), medicamento.getText(), planT.getText(), n));
            Mensajes.exito(this, "Consulta registrada");
            BotonCancelarHCActionPerformed(null);

        }
    }//GEN-LAST:event_BotonAceptarRNA1ActionPerformed

    private void BotonCancelarHCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarHCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonCancelarHCActionPerformed

    private void cvePer8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cvePer8KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cvePer8KeyPressed

    private void cvePer8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cvePer8KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cvePer8KeyTyped

    private void cvePer9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cvePer9KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cvePer9KeyPressed

    private void cvePer9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cvePer9KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cvePer9KeyTyped

    private void BotonAceptarRNA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAceptarRNA2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonAceptarRNA2ActionPerformed

    private void cveRAlumKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_cveRAlumKeyPressed
    {//GEN-HEADEREND:event_cveRAlumKeyPressed
        if (evt.getKeyChar() == '\n')
        {
            if (Menu.buscar(menu.a, cveRAlum.getText()) != -1)
            {

                Mensajes.error(this, "Matrícula existente");

                BotonCancelarModAActionPerformed(null);
            }
        } else
        {
            Validaciones.enterCadenaNoVacia(this, evt, cveRAlum, nombre);
        }
    }//GEN-LAST:event_cveRAlumKeyPressed

    private void BotonAceptarAlumKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_BotonAceptarAlumKeyPressed
    {//GEN-HEADEREND:event_BotonAceptarAlumKeyPressed
        if (evt.getKeyChar() == '\n')
        {
            BotonAceptarAlumActionPerformed(null);
        }
    }//GEN-LAST:event_BotonAceptarAlumKeyPressed

    private void cveModAActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cveModAActionPerformed
    {//GEN-HEADEREND:event_cveModAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cveModAActionPerformed

    private void ComboBoxDesnutricionModAActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ComboBoxDesnutricionModAActionPerformed
    {//GEN-HEADEREND:event_ComboBoxDesnutricionModAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxDesnutricionModAActionPerformed

    private void ComboBoxSobrepesoModAItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_ComboBoxSobrepesoModAItemStateChanged
    {//GEN-HEADEREND:event_ComboBoxSobrepesoModAItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxSobrepesoModAItemStateChanged

    private void ComboBoxSobrepesoModAActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ComboBoxSobrepesoModAActionPerformed
    {//GEN-HEADEREND:event_ComboBoxSobrepesoModAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxSobrepesoModAActionPerformed

    private void ComboBoxAlergiasModAItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_ComboBoxAlergiasModAItemStateChanged
    {//GEN-HEADEREND:event_ComboBoxAlergiasModAItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxAlergiasModAItemStateChanged

    private void ComboBoxAlergiasModAActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ComboBoxAlergiasModAActionPerformed
    {//GEN-HEADEREND:event_ComboBoxAlergiasModAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxAlergiasModAActionPerformed

    private void ComboBoxObesidadModAItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_ComboBoxObesidadModAItemStateChanged
    {//GEN-HEADEREND:event_ComboBoxObesidadModAItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxObesidadModAItemStateChanged

    private void ComboBoxObesidadModAActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ComboBoxObesidadModAActionPerformed
    {//GEN-HEADEREND:event_ComboBoxObesidadModAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxObesidadModAActionPerformed

    private void ComboBoxDiabetesModAItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_ComboBoxDiabetesModAItemStateChanged
    {//GEN-HEADEREND:event_ComboBoxDiabetesModAItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxDiabetesModAItemStateChanged

    private void ComboBoxDiabetesModAActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ComboBoxDiabetesModAActionPerformed
    {//GEN-HEADEREND:event_ComboBoxDiabetesModAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxDiabetesModAActionPerformed

    private void ComboBoxAlergiasAItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_ComboBoxAlergiasAItemStateChanged
    {//GEN-HEADEREND:event_ComboBoxAlergiasAItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxAlergiasAItemStateChanged

    private void ComboBoxObesidadAItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_ComboBoxObesidadAItemStateChanged
    {//GEN-HEADEREND:event_ComboBoxObesidadAItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxObesidadAItemStateChanged

    private void ComboBoxSobrepesoAItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_ComboBoxSobrepesoAItemStateChanged
    {//GEN-HEADEREND:event_ComboBoxSobrepesoAItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxSobrepesoAItemStateChanged

    private void ComboBoxDiabetesAItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_ComboBoxDiabetesAItemStateChanged
    {//GEN-HEADEREND:event_ComboBoxDiabetesAItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxDiabetesAItemStateChanged

    private void medicamentoKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_medicamentoKeyPressed
    {//GEN-HEADEREND:event_medicamentoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicamentoKeyPressed

    private void medicamentoKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_medicamentoKeyTyped
    {//GEN-HEADEREND:event_medicamentoKeyTyped
        Validaciones.validaAlfabeticos(evt, 30, medicamento.getText());
    }//GEN-LAST:event_medicamentoKeyTyped

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        ManipulacionArchivos.guarda(
                "../DatosI/alumnos.dat", a);
        ManipulacionArchivos.guarda(
                "../DatosI/personal.dat", p);
        ManipulacionArchivos.guardaMat("../DatosIM/HC.dat", H);
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        a = (Datos[]) ManipulacionArchivos.cargaArr("../DatosI/alumnos.dat");
        p = (Datos[]) ManipulacionArchivos.cargaArr("../DatosI/personal.dat");
        H = (HistorialClinico[][]) ManipulacionArchivos.cargaMat("../DatosIM/HC.dat");
    }//GEN-LAST:event_formWindowOpened

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jPanel1MouseReleased
    {//GEN-HEADEREND:event_jPanel1MouseReleased

    }//GEN-LAST:event_jPanel1MouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        int posicion = jButton1.getX();
        if (posicion > 0)
        {
            Animacion.Animacion.mover_izquierda(240, 0, 2, 2, jButton1);
            Animacion.Animacion.mover_izquierda(200, 0, 2, 2, PanelIzq);
        } else
        {
            Animacion.Animacion.mover_derecha(0, 240, 2, 2, jButton1);
            Animacion.Animacion.mover_derecha(-200, 0, 2, 2, PanelIzq);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cvePer8ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cvePer8ActionPerformed
    {//GEN-HEADEREND:event_cvePer8ActionPerformed
        
    }//GEN-LAST:event_cvePer8ActionPerformed
    private void resetearComboBoxesA()
    {
        // Limpiar los valores de los JComboBox
        ComboBoxSexoA1.setSelectedIndex(0);
        ComboBoxDesnutricionA1.setSelectedIndex(0);
        ComboBoxSobrepesoA.setSelectedIndex(0);
        ComboBoxAlergiasA.setSelectedIndex(0);
        ComboBoxObesidadA.setSelectedIndex(0);
        ComboBoxDiabetesA.setSelectedIndex(0);
        ComboBoxViveConA1.setSelectedIndex(0);
        ComboBoxCarreraA1.setSelectedIndex(0);

    }

    private void resetearComboBoxesP()
    {
        // Limpiar los valores de los JComboBox
        ComboBoxSexoP1.setSelectedIndex(0);
        ComboBoxDesnutricionP1.setSelectedIndex(0);
        ComboBoxSobrepesoP1.setSelectedIndex(0);
        ComboBoxAlergiasP1.setSelectedIndex(0);
        ComboBoxObesidadP1.setSelectedIndex(0);
        ComboBoxDiabetesP1.setSelectedIndex(0);
        ComboBoxEstatusP1.setSelectedIndex(0);

    }

    private boolean validarComboBoxesModA()
    {
        // Verificar si todos los JComboBox tienen una opción seleccionada
        return ComboBoxSexoModA.getSelectedIndex() != -1
                && ComboBoxDesnutricionModA.getSelectedIndex() != -1
                && ComboBoxDiabetesModA.getSelectedIndex() != -1
                && ComboBoxSobrepesoModA.getSelectedIndex() != -1
                && ComboBoxAlergiasModA.getSelectedIndex() != -1
                && ComboBoxObesidadModA.getSelectedIndex() != -1
                && ComboBoxViveModA.getSelectedIndex() != -1
                && ComboBoxCarreraModA.getSelectedIndex() != -1;
    }

    private boolean validarComboBoxesModP()
    {
        // Verificar si todos los JComboBox tienen una opción seleccionada
        return ComboBoxSexoModA.getSelectedIndex() != -1
                && ComboBoxDesnutricionModA.getSelectedIndex() != -1
                && ComboBoxDiabetesModA.getSelectedIndex() != -1
                && ComboBoxSobrepesoModA.getSelectedIndex() != -1
                && ComboBoxAlergiasModA.getSelectedIndex() != -1
                && ComboBoxObesidadModA.getSelectedIndex() != -1
                && ComboBoxViveModA.getSelectedIndex() != -1
                && ComboBoxCarreraModA.getSelectedIndex() != -1;
    }

    private boolean validarComboBoxesA()
    {
        // Verificar si todos los JComboBox tienen una opción seleccionada
        return ComboBoxSexoA1.getSelectedIndex() != -1
                && ComboBoxDesnutricionA1.getSelectedIndex() != -1
                && ComboBoxDiabetesA.getSelectedIndex() != -1
                && ComboBoxSobrepesoA.getSelectedIndex() != -1
                && ComboBoxAlergiasA.getSelectedIndex() != -1
                && ComboBoxObesidadA.getSelectedIndex() != -1
                && ComboBoxViveConA1.getSelectedIndex() != -1
                && ComboBoxCarreraA1.getSelectedIndex() != -1;
    }

    private boolean validarComboBoxesP()
    {
        // Verificar si todos los JComboBox tienen una opción seleccionada
        return ComboBoxSexoP1.getSelectedIndex() != -1
                && ComboBoxDesnutricionP1.getSelectedIndex() != -1
                && ComboBoxDiabetesP1.getSelectedIndex() != -1
                && ComboBoxSobrepesoP1.getSelectedIndex() != -1
                && ComboBoxAlergiasP1.getSelectedIndex() != -1
                && ComboBoxObesidadP1.getSelectedIndex() != -1
                && ComboBoxEstatusP1.getSelectedIndex() != -1;
    }

    private boolean validarCajasTextoModA()
    {
        // Verificar si ambas cajas de texto no están vacías
        return !cveModA.getText().isEmpty() && !oEnferModA.getText().isEmpty();
    }

    private boolean validarCajasTextoA()
    {
        // Verificar si ambas cajas de texto no están vacías
        return !cveRAlum.getText().isEmpty() && !otrasenfermedades.getText().isEmpty()
                && !nombre.getText().isEmpty() && !primerAp.getText().isEmpty()
                && !segundoAp.getText().isEmpty();
    }

    private boolean validarCajasTextoP()
    {
        // Verificar si ambas cajas de texto no están vacías
        return !cvePer.getText().isEmpty() && !oEnferPer.getText().isEmpty()
                && !nombrePer.getText().isEmpty() && !primerApPer.getText().isEmpty()
                && !segundoApPer.getText().isEmpty();
    }

    private boolean validarCajasTextoModP()
    {
        // Verificar si ambas cajas de texto no están vacías
        return !cveRAlum.getText().isEmpty() && !oEnferModA.getText().isEmpty();
    }

    public static boolean convertirComboBoxABoolean(JComboBox<String> comboBox)
    {

        String valorSeleccionado = (String) comboBox.getSelectedItem();

        return "Si".equalsIgnoreCase(valorSeleccionado);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Alumnos;
    private javax.swing.JTextField Antecedentes;
    private javax.swing.JLabel Bienvenidos;
    private javax.swing.JButton BotonAceptarAlum;
    private javax.swing.JButton BotonAceptarModA;
    private javax.swing.JButton BotonAceptarRNA1;
    private javax.swing.JButton BotonAceptarRNA2;
    private javax.swing.JButton BotonAceptarRNP;
    private javax.swing.JButton BotonAceptarRNP1;
    private javax.swing.JButton BotonCancelarAlum;
    private javax.swing.JButton BotonCancelarHC;
    private javax.swing.JButton BotonCancelarModA;
    private javax.swing.JButton BotonCancelarModP;
    private javax.swing.JButton BotonCancelarPer;
    private javax.swing.JLabel CierreCompleto;
    private javax.swing.JComboBox<String> ComboBoxAlergiasA;
    private javax.swing.JComboBox<String> ComboBoxAlergiasModA;
    private javax.swing.JComboBox<String> ComboBoxAlergiasModP;
    private javax.swing.JComboBox<String> ComboBoxAlergiasP1;
    private javax.swing.JComboBox<String> ComboBoxCarreraA1;
    private javax.swing.JComboBox<String> ComboBoxCarreraModA;
    private javax.swing.JComboBox<String> ComboBoxDesnutricionA1;
    private javax.swing.JComboBox<String> ComboBoxDesnutricionModA;
    private javax.swing.JComboBox<String> ComboBoxDesnutricionP1;
    private javax.swing.JComboBox<String> ComboBoxDesnutrucionModP;
    private javax.swing.JComboBox<String> ComboBoxDiabetesA;
    private javax.swing.JComboBox<String> ComboBoxDiabetesModA;
    private javax.swing.JComboBox<String> ComboBoxDiabetesModP;
    private javax.swing.JComboBox<String> ComboBoxDiabetesP1;
    private javax.swing.JComboBox<String> ComboBoxEstatusModP;
    private javax.swing.JComboBox<String> ComboBoxEstatusP1;
    private javax.swing.JComboBox<String> ComboBoxObesidadA;
    private javax.swing.JComboBox<String> ComboBoxObesidadModA;
    private javax.swing.JComboBox<String> ComboBoxObesidadModP;
    private javax.swing.JComboBox<String> ComboBoxObesidadP1;
    private javax.swing.JComboBox<String> ComboBoxSexoA1;
    private javax.swing.JComboBox<String> ComboBoxSexoModA;
    private javax.swing.JComboBox<String> ComboBoxSexoModP;
    private javax.swing.JComboBox<String> ComboBoxSexoP1;
    private javax.swing.JComboBox<String> ComboBoxSobrepesoA;
    private javax.swing.JComboBox<String> ComboBoxSobrepesoModA;
    private javax.swing.JComboBox<String> ComboBoxSobrepesoModP;
    private javax.swing.JComboBox<String> ComboBoxSobrepesoP1;
    private javax.swing.JComboBox<String> ComboBoxViveConA1;
    private javax.swing.JComboBox<String> ComboBoxViveModA;
    private javax.swing.JTextArea ConsulAlum;
    private javax.swing.JTextArea ConsulPerso;
    private javax.swing.JPanel CuadroAlumnos;
    private javax.swing.JPanel CuadroCA;
    private javax.swing.JPanel CuadroCAE;
    private javax.swing.JPanel CuadroCAEnf;
    private javax.swing.JPanel CuadroCAlu;
    private javax.swing.JPanel CuadroCDRE;
    private javax.swing.JPanel CuadroCDREnf;
    private javax.swing.JPanel CuadroCP;
    private javax.swing.JPanel CuadroCPer;
    private javax.swing.JPanel CuadroFuncion;
    private javax.swing.JPanel CuadroMA;
    private javax.swing.JPanel CuadroMAlu;
    private javax.swing.JPanel CuadroMP;
    private javax.swing.JPanel CuadroMPer;
    private javax.swing.JPanel CuadroPersonal;
    private javax.swing.JPanel CuadroRCCE;
    private javax.swing.JPanel CuadroRCCEnf;
    private javax.swing.JPanel CuadroRIA;
    private javax.swing.JPanel CuadroRIAlu;
    private javax.swing.JPanel CuadroRIP;
    private javax.swing.JPanel CuadroRIPer;
    private javax.swing.JPanel CuadroRNA;
    private javax.swing.JPanel CuadroRNAl;
    private javax.swing.JPanel CuadroRNP;
    private javax.swing.JPanel CuadroRNPer;
    private javax.swing.JPanel CuadroSalirAl;
    private javax.swing.JPanel CuadroSalirCA;
    private javax.swing.JLabel CuadroSalirCAEnf;
    private javax.swing.JPanel CuadroSalirCAEnfe;
    private javax.swing.JPanel CuadroSalirCDREnf;
    private javax.swing.JPanel CuadroSalirCPer;
    private javax.swing.JPanel CuadroSalirE;
    private javax.swing.JPanel CuadroSalirFun;
    private javax.swing.JPanel CuadroSalirMA;
    private javax.swing.JPanel CuadroSalirMPer;
    private javax.swing.JPanel CuadroSalirP;
    private javax.swing.JPanel CuadroSalirRCCEnf;
    private javax.swing.JPanel CuadroSalirRIA;
    private javax.swing.JPanel CuadroSalirRIPer;
    private javax.swing.JPanel CuadroSalirRNA;
    private javax.swing.JPanel CuadroSalirRNPer;
    private javax.swing.JPanel CuadrosEnfermeria;
    private javax.swing.JPanel Enfermeria;
    private javax.swing.JPanel Funcion;
    private javax.swing.JPanel Inicio;
    private javax.swing.JTextField Padecimientos;
    private javax.swing.JPanel PanelAlumno;
    private javax.swing.JPanel PanelAlumnos;
    private javax.swing.JPanel PanelEnfermeria;
    private javax.swing.JPanel PanelEnfermeria2;
    private javax.swing.JPanel PanelFuncion;
    private javax.swing.JPanel PanelInicio;
    private javax.swing.JPanel PanelIzq;
    private javax.swing.JPanel PanelMenu;
    private javax.swing.JPanel PanelPersonal;
    private javax.swing.JPanel PanelPersonal2;
    private javax.swing.JPanel PanelSuperior;
    private javax.swing.JPanel PanelVerMas;
    private javax.swing.JPanel PanelVerMas2;
    private javax.swing.JPanel PanelVerMas3;
    private javax.swing.JPanel PanelVerMas4;
    private javax.swing.JPanel Personal;
    private javax.swing.JTabbedPane TablaAlumno;
    private javax.swing.JTabbedPane TablaEnfermeria;
    private javax.swing.JTabbedPane TablaOpciones;
    private javax.swing.JTabbedPane TablaPersonal;
    private javax.swing.JLabel TextoUNIVERSIDAD;
    private javax.swing.JLabel TituloComoFunciona1;
    private javax.swing.JPanel TituloFuncion;
    private javax.swing.JLabel TxtAlergiasA;
    private javax.swing.JLabel TxtAlergiasRNP;
    private javax.swing.JLabel TxtAlergiasRNP1;
    private javax.swing.JLabel TxtAlergiasRNP2;
    private javax.swing.JLabel TxtAlumnoPanel;
    private javax.swing.JLabel TxtAlumnos;
    private javax.swing.JLabel TxtAlumnos2;
    private javax.swing.JLabel TxtApeMatP;
    private javax.swing.JLabel TxtApePatRNP;
    private javax.swing.JLabel TxtApellidoMatRNA;
    private javax.swing.JLabel TxtApellidoPatRNA;
    private javax.swing.JLabel TxtCAE;
    private javax.swing.JLabel TxtCAEnf;
    private javax.swing.JLabel TxtCAlu;
    private javax.swing.JLabel TxtCDRE;
    private javax.swing.JLabel TxtCDREnf;
    private javax.swing.JLabel TxtCP;
    private javax.swing.JLabel TxtCPer;
    private javax.swing.JLabel TxtCarreraRNA;
    private javax.swing.JLabel TxtConsultaAl;
    private javax.swing.JLabel TxtDesnutricionA;
    private javax.swing.JLabel TxtDesnutricionRNP;
    private javax.swing.JLabel TxtDesnutricionRNP1;
    private javax.swing.JLabel TxtDesnutricionRNP2;
    private javax.swing.JLabel TxtDiabetesA1;
    private javax.swing.JLabel TxtDiabetesA2;
    private javax.swing.JLabel TxtDiabetesA3;
    private javax.swing.JLabel TxtDiabetesA4;
    private javax.swing.JLabel TxtEnfermeria;
    private javax.swing.JLabel TxtEnfermeria2;
    private javax.swing.JLabel TxtEnfermeriaPanel;
    private javax.swing.JLabel TxtFuncion;
    private javax.swing.JLabel TxtFuncion2;
    private javax.swing.JLabel TxtGeneroA;
    private javax.swing.JLabel TxtGeneroRNP;
    private javax.swing.JLabel TxtGeneroRNP1;
    private javax.swing.JLabel TxtGeneroRNP2;
    private javax.swing.JLabel TxtInicio;
    private javax.swing.JLabel TxtInicio2;
    private javax.swing.JLabel TxtMP;
    private javax.swing.JLabel TxtMPer;
    private javax.swing.JLabel TxtMPer1;
    private javax.swing.JLabel TxtMatriculaRNA;
    private javax.swing.JLabel TxtMatriculaRNP;
    private javax.swing.JLabel TxtMatriculaRNP1;
    private javax.swing.JLabel TxtMatriculaRNP2;
    private javax.swing.JLabel TxtMatriculaRNP3;
    private javax.swing.JLabel TxtMatriculaRNP4;
    private javax.swing.JLabel TxtMatriculaRNP5;
    private javax.swing.JLabel TxtMatriculaRNP6;
    private javax.swing.JLabel TxtMatriculaRNP7;
    private javax.swing.JLabel TxtMatriculaRNP8;
    private javax.swing.JLabel TxtMatriculaRNP9;
    private javax.swing.JLabel TxtModAlu;
    private javax.swing.JLabel TxtModificacionesAl;
    private javax.swing.JLabel TxtNombreRNA;
    private javax.swing.JLabel TxtNombreRNP;
    private javax.swing.JLabel TxtObesidadA1;
    private javax.swing.JLabel TxtObesidadA2;
    private javax.swing.JLabel TxtObesidadA3;
    private javax.swing.JLabel TxtObesidadA4;
    private javax.swing.JLabel TxtOtraEnfRNA;
    private javax.swing.JLabel TxtOtraEnferRNP;
    private javax.swing.JLabel TxtOtraEnferRNP1;
    private javax.swing.JLabel TxtOtraEnferRNP2;
    private javax.swing.JLabel TxtPersonal;
    private javax.swing.JLabel TxtPersonal2;
    private javax.swing.JLabel TxtPersonalPanel;
    private javax.swing.JLabel TxtPersonalRN;
    private javax.swing.JLabel TxtRCCE;
    private javax.swing.JLabel TxtRCCEnf;
    private javax.swing.JLabel TxtRIAlu;
    private javax.swing.JLabel TxtRIP;
    private javax.swing.JLabel TxtRIPer;
    private javax.swing.JLabel TxtRNAlu;
    private javax.swing.JLabel TxtRNP;
    private javax.swing.JLabel TxtRNPer;
    private javax.swing.JLabel TxtRegistroAl;
    private javax.swing.JLabel TxtReporteInfAl;
    private javax.swing.JLabel TxtSalirAl;
    private javax.swing.JLabel TxtSalirCA;
    private javax.swing.JLabel TxtSalirCDREnf;
    private javax.swing.JLabel TxtSalirCPer;
    private javax.swing.JLabel TxtSalirEnf;
    private javax.swing.JLabel TxtSalirFun;
    private javax.swing.JLabel TxtSalirMPer;
    private javax.swing.JLabel TxtSalirP;
    private javax.swing.JLabel TxtSalirRCCEnf;
    private javax.swing.JLabel TxtSalirRIA;
    private javax.swing.JLabel TxtSalirRIP;
    private javax.swing.JLabel TxtSalirRNA;
    private javax.swing.JLabel TxtSobrepesoA1;
    private javax.swing.JLabel TxtSobrepesoA2;
    private javax.swing.JLabel TxtSobrepesoA3;
    private javax.swing.JLabel TxtSobrepesoA4;
    private javax.swing.JLabel TxtViveConRNA;
    private javax.swing.JLabel TxtViveConRNP;
    private javax.swing.JLabel TxtViveConRNP1;
    private javax.swing.JLabel TxtViveConRNP3;
    private javax.swing.JLabel TxtViveConRNP5;
    private javax.swing.JLabel VerMas1;
    private javax.swing.JLabel VerMas2;
    private javax.swing.JLabel VerMas3;
    private javax.swing.JLabel VerMas4;
    private javax.swing.JTextField cveHC;
    private javax.swing.JTextField cveModA;
    private javax.swing.JTextField cvePer;
    private javax.swing.JTextField cvePer1;
    private javax.swing.JTextField cvePer8;
    private javax.swing.JTextField cvePer9;
    private javax.swing.JTextField cveRAlum;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextField medicamento;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField nombrePer;
    private javax.swing.JTextField oEnferModA;
    private javax.swing.JTextField oEnferModP;
    private javax.swing.JTextField oEnferPer;
    private javax.swing.JTextField otrasenfermedades;
    private javax.swing.JTextField planT;
    private javax.swing.JTextField primerAp;
    private javax.swing.JTextField primerApPer;
    private javax.swing.JTextField segundoAp;
    private javax.swing.JTextField segundoApPer;
    // End of variables declaration//GEN-END:variables
}
