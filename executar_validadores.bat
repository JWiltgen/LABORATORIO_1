@echo off
echo ============================================
echo     EXECUTANDO TODOS OS VALIDADORES
echo ============================================
echo.

echo [1/4] Executando Validador Etapa 1...
echo ----------------------------------------
java -cp bin ValidadorEtapa1
echo.

echo [2/4] Executando Validador Etapa 2...
echo ----------------------------------------
java -cp bin ValidadorEtapa2
echo.

echo [3/4] Executando Validador Etapa 3...
echo ----------------------------------------
java -cp bin ValidadorEtapa3
echo.

echo [4/4] Executando Validador Etapa 4...
echo ----------------------------------------
java -cp bin ValidadorEtapa4
echo.

echo ============================================
echo     TODOS OS VALIDADORES EXECUTADOS!
echo ============================================
pause