package Login;

import Login.*;
import java.awt.Color;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.util.ArrayList;
import CrearMazo.*;
import javax.swing.DefaultListModel;

public final class SegundoMenu extends javax.swing.JFrame {

    private static ArrayList<Mazo>mazos = new ArrayList<>();
    
    public SegundoMenu() {
        initComponents();
        setLocationRelativeTo(null);
        //iconoPrograma();
        
        DefaultListModel<String> modeloLista = (DefaultListModel<String>) jList1.getModel();
        for(int i=0;i<mazos.size();i++){
            modeloLista.addElement(mazos.get(i).getNombre());
        }
        if(!mazos.isEmpty()){
            mazos.get(TercerMenu.getIndiceMazo()).setCartas(TercerMenu.getCartas());
        }
    }
    
    public static ArrayList<Mazo> getMazos(){
        return mazos;
    }
    
    public static void setMazos(ArrayList<Mazo>mazosGuardar){
        mazos = mazosGuardar;
    }
    
    public void btnAgregarHover(){
        panelRoundBtnAgregar.setBackground(new Color(85,85,85));
    }
    
    public void btnAgregarNotHover(){
        panelRoundBtnAgregar.setBackground(new Color(51,51,51));
    }
    
    public void btnEliminarHover(){
        panelRoundBtnEliminar.setBackground(new Color(85,85,85));
    }
    
    public void btnEliminarNotHover(){
        panelRoundBtnEliminar.setBackground(new Color(51,51,51));
    }
    
    public void btnEditarHover(){
        panelRoundBtnEditar.setBackground(new Color(85,85,85));
    }
    
    public void btnEditarNotHover(){
        panelRoundBtnEditar.setBackground(new Color(51,51,51));
    }
    
    public void btnVerHover(){
        panelRoundBtnVer.setBackground(new Color(85,85,85));
    }
    
    public void btnVerNotHover(){
        panelRoundBtnVer.setBackground(new Color(51,51,51));
    }
    
    public void btnVolverHover(){
        panelRoundBtnVolver.setBackground(new Color(100,100,100));
    }
    
    public void btnVolverNotHover(){
        panelRoundBtnVolver.setBackground(new Color(153,153,153));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelRoundBtnEliminar = new Utilidad.PanelRound();
        btnEliminar = new javax.swing.JButton();
        campoNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        panelRoundBtnAgregar = new Utilidad.PanelRound();
        btnAgregar = new javax.swing.JButton();
        panelRoundBtnVer = new Utilidad.PanelRound();
        btnVer = new javax.swing.JButton();
        panelRoundBtnEditar = new Utilidad.PanelRound();
        btnEditar = new javax.swing.JButton();
        panelRoundBtnVolver = new Utilidad.PanelRound();
        btnVolver = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        panelRound3 = new Utilidad.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("[Nombre Proyecto]");

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(105, 105, 105));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cardsicon.png"))); // NOI18N

        panelRoundBtnEliminar.setBackground(new java.awt.Color(51, 51, 51));
        panelRoundBtnEliminar.setForeground(new java.awt.Color(105, 105, 105));
        panelRoundBtnEliminar.setRoundBottomLeft(60);
        panelRoundBtnEliminar.setRoundBottomRight(60);
        panelRoundBtnEliminar.setRoundTopLeft(60);
        panelRoundBtnEliminar.setRoundTopRight(60);
        panelRoundBtnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelRoundBtnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelRoundBtnEliminarMouseExited(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(51, 51, 51));
        btnEliminar.setFont(new java.awt.Font("Unispace", 0, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(new javax.swing.border.MatteBorder(null));
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
        });
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRoundBtnEliminarLayout = new javax.swing.GroupLayout(panelRoundBtnEliminar);
        panelRoundBtnEliminar.setLayout(panelRoundBtnEliminarLayout);
        panelRoundBtnEliminarLayout.setHorizontalGroup(
            panelRoundBtnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundBtnEliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRoundBtnEliminarLayout.setVerticalGroup(
            panelRoundBtnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundBtnEliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre:");

        panelRoundBtnAgregar.setBackground(new java.awt.Color(51, 51, 51));
        panelRoundBtnAgregar.setForeground(new java.awt.Color(105, 105, 105));
        panelRoundBtnAgregar.setRoundBottomLeft(60);
        panelRoundBtnAgregar.setRoundBottomRight(60);
        panelRoundBtnAgregar.setRoundTopLeft(60);
        panelRoundBtnAgregar.setRoundTopRight(60);
        panelRoundBtnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelRoundBtnAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelRoundBtnAgregarMouseExited(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(51, 51, 51));
        btnAgregar.setFont(new java.awt.Font("Unispace", 0, 18)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("AGREGAR");
        btnAgregar.setBorder(new javax.swing.border.MatteBorder(null));
        btnAgregar.setBorderPainted(false);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarMouseExited(evt);
            }
        });
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRoundBtnAgregarLayout = new javax.swing.GroupLayout(panelRoundBtnAgregar);
        panelRoundBtnAgregar.setLayout(panelRoundBtnAgregarLayout);
        panelRoundBtnAgregarLayout.setHorizontalGroup(
            panelRoundBtnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundBtnAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRoundBtnAgregarLayout.setVerticalGroup(
            panelRoundBtnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundBtnAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelRoundBtnVer.setBackground(new java.awt.Color(51, 51, 51));
        panelRoundBtnVer.setForeground(new java.awt.Color(105, 105, 105));
        panelRoundBtnVer.setRoundBottomLeft(60);
        panelRoundBtnVer.setRoundBottomRight(60);
        panelRoundBtnVer.setRoundTopLeft(60);
        panelRoundBtnVer.setRoundTopRight(60);
        panelRoundBtnVer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelRoundBtnVerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelRoundBtnVerMouseExited(evt);
            }
        });

        btnVer.setBackground(new java.awt.Color(51, 51, 51));
        btnVer.setFont(new java.awt.Font("Unispace", 0, 18)); // NOI18N
        btnVer.setForeground(new java.awt.Color(255, 255, 255));
        btnVer.setText("VER");
        btnVer.setBorder(new javax.swing.border.MatteBorder(null));
        btnVer.setBorderPainted(false);
        btnVer.setContentAreaFilled(false);
        btnVer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVerMouseExited(evt);
            }
        });
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRoundBtnVerLayout = new javax.swing.GroupLayout(panelRoundBtnVer);
        panelRoundBtnVer.setLayout(panelRoundBtnVerLayout);
        panelRoundBtnVerLayout.setHorizontalGroup(
            panelRoundBtnVerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundBtnVerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVer, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRoundBtnVerLayout.setVerticalGroup(
            panelRoundBtnVerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundBtnVerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelRoundBtnEditar.setBackground(new java.awt.Color(51, 51, 51));
        panelRoundBtnEditar.setForeground(new java.awt.Color(105, 105, 105));
        panelRoundBtnEditar.setRoundBottomLeft(60);
        panelRoundBtnEditar.setRoundBottomRight(60);
        panelRoundBtnEditar.setRoundTopLeft(60);
        panelRoundBtnEditar.setRoundTopRight(60);
        panelRoundBtnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelRoundBtnEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelRoundBtnEditarMouseExited(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(51, 51, 51));
        btnEditar.setFont(new java.awt.Font("Unispace", 0, 18)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("EDITAR");
        btnEditar.setBorder(new javax.swing.border.MatteBorder(null));
        btnEditar.setBorderPainted(false);
        btnEditar.setContentAreaFilled(false);
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarMouseExited(evt);
            }
        });
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRoundBtnEditarLayout = new javax.swing.GroupLayout(panelRoundBtnEditar);
        panelRoundBtnEditar.setLayout(panelRoundBtnEditarLayout);
        panelRoundBtnEditarLayout.setHorizontalGroup(
            panelRoundBtnEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundBtnEditarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRoundBtnEditarLayout.setVerticalGroup(
            panelRoundBtnEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundBtnEditarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelRoundBtnVolver.setBackground(new java.awt.Color(153, 153, 153));
        panelRoundBtnVolver.setForeground(new java.awt.Color(105, 105, 105));
        panelRoundBtnVolver.setRoundBottomLeft(60);
        panelRoundBtnVolver.setRoundBottomRight(60);
        panelRoundBtnVolver.setRoundTopLeft(60);
        panelRoundBtnVolver.setRoundTopRight(60);
        panelRoundBtnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelRoundBtnVolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelRoundBtnVolverMouseExited(evt);
            }
        });

        btnVolver.setBackground(new java.awt.Color(51, 51, 51));
        btnVolver.setFont(new java.awt.Font("Unispace", 0, 18)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/volver.png"))); // NOI18N
        btnVolver.setBorder(new javax.swing.border.MatteBorder(null));
        btnVolver.setBorderPainted(false);
        btnVolver.setContentAreaFilled(false);
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolverMouseExited(evt);
            }
        });
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRoundBtnVolverLayout = new javax.swing.GroupLayout(panelRoundBtnVolver);
        panelRoundBtnVolver.setLayout(panelRoundBtnVolverLayout);
        panelRoundBtnVolverLayout.setHorizontalGroup(
            panelRoundBtnVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRoundBtnVolverLayout.createSequentialGroup()
                .addGap(0, 5, Short.MAX_VALUE)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelRoundBtnVolverLayout.setVerticalGroup(
            panelRoundBtnVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundBtnVolverLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVolver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1))
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRoundBtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRoundBtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRoundBtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRoundBtnVer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(panelRoundBtnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRoundBtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRoundBtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelRoundBtnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRoundBtnVer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRoundBtnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 110));

        jPanel2.setBackground(new java.awt.Color(208, 208, 210));

        panelRound3.setBackground(new java.awt.Color(194, 194, 194));
        panelRound3.setRoundBottomLeft(80);
        panelRound3.setRoundBottomRight(80);
        panelRound3.setRoundTopLeft(80);
        panelRound3.setRoundTopRight(80);

        jScrollPane1.setBackground(new java.awt.Color(187, 187, 187));
        jScrollPane1.setBorder(null);

        DefaultListModel<String> modeloLista = new DefaultListModel<>();
        jList1.setBackground(new java.awt.Color(194, 194, 194));
        jList1.setBorder(null);
        jList1.setForeground(new java.awt.Color(60, 63, 65));
        jList1.setModel(modeloLista);
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.setSelectionBackground(new java.awt.Color(153, 153, 153));
        jList1.setSelectionForeground(new java.awt.Color(60, 63, 65));
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout panelRound3Layout = new javax.swing.GroupLayout(panelRound3);
        panelRound3.setLayout(panelRound3Layout);
        panelRound3Layout.setHorizontalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound3Layout.setVerticalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Unispace", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(60, 63, 65));
        jLabel3.setText("MAZOS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(panelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(296, 296, 296))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 670, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        // TODO add your handling code here:
        btnEliminarHover();
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        // TODO add your handling code here:
        btnEliminarNotHover();
    }//GEN-LAST:event_btnEliminarMouseExited

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        DefaultListModel<String> modeloLista = (DefaultListModel<String>) jList1.getModel();
        int i = jList1.getSelectedIndex();
        modeloLista.remove(i);
        mazos.remove(i);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void panelRoundBtnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRoundBtnEliminarMouseEntered
        // TODO add your handling code here:
        btnEliminarHover();
    }//GEN-LAST:event_panelRoundBtnEliminarMouseEntered

    private void panelRoundBtnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRoundBtnEliminarMouseExited
        // TODO add your handling code here:
        btnEliminarNotHover();
    }//GEN-LAST:event_panelRoundBtnEliminarMouseExited

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
        // TODO add your handling code here:
        btnAgregarHover();
    }//GEN-LAST:event_btnAgregarMouseEntered

    private void btnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseExited
        // TODO add your handling code here:
        btnAgregarNotHover();
    }//GEN-LAST:event_btnAgregarMouseExited

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        DefaultListModel<String> modeloLista = (DefaultListModel<String>) jList1.getModel();
        String nombre = campoNombre.getText().trim();
        boolean band = true;
        if(nombre.isBlank()){
            band = false;
            JOptionPane.showMessageDialog(null, "Ingresa un nombre para el mazo");
        }
        for(int i=0;i<modeloLista.size();i++){
            if(nombre.equals(modeloLista.get(i))){
                band = false;
                JOptionPane.showMessageDialog(null, "El nombre del mazo ya se encuentra en uso, intenta con otro");
            }
        }
        if(band){
            ArrayList<Carta> cartas = new ArrayList<>();
            mazos.add(new Mazo(nombre, cartas));
            modeloLista.addElement(nombre);
            campoNombre.setText("");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void panelRoundBtnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRoundBtnAgregarMouseEntered
        // TODO add your handling code here:
        btnAgregarHover();
    }//GEN-LAST:event_panelRoundBtnAgregarMouseEntered

    private void panelRoundBtnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRoundBtnAgregarMouseExited
        // TODO add your handling code here:
        btnAgregarNotHover();
    }//GEN-LAST:event_panelRoundBtnAgregarMouseExited

    private void btnVerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerMouseEntered
        // TODO add your handling code here:
        btnVerHover();
    }//GEN-LAST:event_btnVerMouseEntered

    private void btnVerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerMouseExited
        // TODO add your handling code here:
        btnVerNotHover();
    }//GEN-LAST:event_btnVerMouseExited

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        // TODO add your handling code here:
        DefaultListModel<String> modeloLista = (DefaultListModel<String>) jList1.getModel();
        if(!modeloLista.isEmpty() && !jList1.isSelectionEmpty()){
            TercerMenu.setIndiceMazo(jList1.getSelectedIndex());
            this.dispose();
            TercerMenu tercermenu = new TercerMenu();
            tercermenu.setVisible(true);
        }
        else{ 
            if(modeloLista.isEmpty()){
                JOptionPane.showMessageDialog(null, "Agrega un mazo");
            }
            else{
                if(jList1.isSelectionEmpty()){
                    JOptionPane.showMessageDialog(null, "Elige un mazo");
                }
            }
        }        
    }//GEN-LAST:event_btnVerActionPerformed

    private void panelRoundBtnVerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRoundBtnVerMouseEntered
        // TODO add your handling code here:
        btnVerHover();
    }//GEN-LAST:event_panelRoundBtnVerMouseEntered

    private void panelRoundBtnVerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRoundBtnVerMouseExited
        // TODO add your handling code here:
        btnVerNotHover();
    }//GEN-LAST:event_panelRoundBtnVerMouseExited

    private void btnEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseEntered
        // TODO add your handling code here:
        btnEditarHover();
    }//GEN-LAST:event_btnEditarMouseEntered

    private void btnEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseExited
        // TODO add your handling code here:
        btnEditarNotHover();
    }//GEN-LAST:event_btnEditarMouseExited

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        DefaultListModel<String> modeloLista = (DefaultListModel<String>) jList1.getModel();
        boolean band = true;
        String nombre = campoNombre.getText().trim();
        if(nombre.isBlank()){
            band = false;
            JOptionPane.showMessageDialog(null, "Ingresa un nombre para el mazo");
        }
        for(int j=0;j<modeloLista.size();j++){
            if(nombre.equals(modeloLista.get(j))){
                band = false;
                JOptionPane.showMessageDialog(null, "El nombre del mazo ya se encuentra en uso, intenta con otro");
            }
        }
        if(band){
            int i = jList1.getSelectedIndex();
            modeloLista.set(i, nombre);
            mazos.get(i).setNombre(nombre);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void panelRoundBtnEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRoundBtnEditarMouseEntered
        // TODO add your handling code here:
        btnEditarHover();
    }//GEN-LAST:event_panelRoundBtnEditarMouseEntered

    private void panelRoundBtnEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRoundBtnEditarMouseExited
        // TODO add your handling code here:
        btnEditarNotHover();
    }//GEN-LAST:event_panelRoundBtnEditarMouseExited

    private void panelRoundBtnVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRoundBtnVolverMouseEntered
        // TODO add your handling code here:
        btnVolverHover();
    }//GEN-LAST:event_panelRoundBtnVolverMouseEntered

    private void panelRoundBtnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRoundBtnVolverMouseExited
        // TODO add your handling code here:
        btnVolverNotHover();
    }//GEN-LAST:event_panelRoundBtnVolverMouseExited

    private void btnVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseEntered
        // TODO add your handling code here:
        btnVolverHover();
    }//GEN-LAST:event_btnVolverMouseEntered

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited
        // TODO add your handling code here:
        btnVolverNotHover();
    }//GEN-LAST:event_btnVolverMouseExited

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Login ventanaLogin = new Login();
        ventanaLogin.setVisible(true);
        System.out.println("los mazos son: "+mazos);
    }//GEN-LAST:event_btnVolverActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SegundoMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SegundoMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SegundoMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SegundoMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SegundoMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVer;
    private javax.swing.JButton btnVolver;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private Utilidad.PanelRound panelRound3;
    private Utilidad.PanelRound panelRoundBtnAgregar;
    private Utilidad.PanelRound panelRoundBtnEditar;
    private Utilidad.PanelRound panelRoundBtnEliminar;
    private Utilidad.PanelRound panelRoundBtnVer;
    private Utilidad.PanelRound panelRoundBtnVolver;
    // End of variables declaration//GEN-END:variables
}
