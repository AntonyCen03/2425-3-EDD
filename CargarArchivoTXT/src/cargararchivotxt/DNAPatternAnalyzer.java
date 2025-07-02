/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cargararchivotxt;

import java.io.*;
import java.util.*;
import javax.swing.JFileChooser;

public class DNAPatternAnalyzer {
    private HashMap<String, List<Integer>> patternTable;
    
    public DNAPatternAnalyzer() {
        patternTable = new HashMap<>();
    }
    
    public void loadFile(File file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        StringBuilder dnaSequence = new StringBuilder();
        
        // Leer todo el archivo
        while ((line = reader.readLine()) != null) {
            dnaSequence.append(line.trim());
        }
        reader.close();
        
        processSequence(dnaSequence.toString());
    }
    
    private void processSequence(String sequence) {
        patternTable.clear();
        
        // Recorrer la secuencia en pasos de 3
        for (int i = 0; i <= sequence.length() - 3; i += 3) {
            String pattern = sequence.substring(i, i + 3);
            
            // Verificar que el patrón solo contenga A, T, C, G
            if (isValidPattern(pattern)) {
                if (!patternTable.containsKey(pattern)) {
                    patternTable.put(pattern, new ArrayList<>());
                }
                patternTable.get(pattern).add(i);
            }
        }
    }
    
    private boolean isValidPattern(String pattern) {
        return pattern.matches("[ATCG]+");
    }
    
    public Map<String, List<Integer>> getPatternTable() {
        return Collections.unmodifiableMap(patternTable);
    }
    
    public int getPatternCount(String pattern) {
        return patternTable.containsKey(pattern) ? patternTable.get(pattern).size() : 0;
    }
    
    public List<Integer> getPatternPositions(String pattern) {
        return patternTable.getOrDefault(pattern, Collections.emptyList());
    }
    
    public static void main(String[] args) {
        DNAPatternAnalyzer analyzer = new DNAPatternAnalyzer();
        JFileChooser fileChooser = new JFileChooser();
        
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            try {
                analyzer.loadFile(fileChooser.getSelectedFile());
                
                // Ejemplo: mostrar estadísticas
                System.out.println("Total de patrones únicos: " + analyzer.getPatternTable().size());
                
                // Opcional: mostrar los 10 patrones más frecuentes
                analyzer.getPatternTable().entrySet().stream()
                    .sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                    .limit(10)
                    .forEach(e -> System.out.println("Patrón " + e.getKey() + ": " + e.getValue().size() + " ocurrencias"));
                
            } catch (IOException e) {
                System.err.println("Error al leer el archivo: " + e.getMessage());
            }
        }
    }
}