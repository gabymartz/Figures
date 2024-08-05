SELECT 
    DF.ID_FACTURA,
    MAX(C.NOMBRE_CLI || ' ' || C.APELLIDO_CLI) AS NOMBRE_CLIENTE,
    Max(E.NOMBRE_EMP || ' ' || E.APELLIDO_EMP) AS NOMBRE_EMPLEADO,
    Min(CG.NOMBRE_CARGO)                       AS CARGO_EMPLEADO,
    MAX(P.NOMBRE_PROD)                         AS PRODUCTO,
    MAX(P.PRECIO_UNIT)                         AS PRECIO_UNITARIO,
    SUM(DF.CANTIDAD)                           AS CANTIDAD,
    MAX(S.NOMBRE_SUC)                          AS SUCURSAL
FROM 
    DETALLE_FACTURA DF
JOIN 
    FACTURA F ON DF.ID_FACTURA = F.ID_FACTURA
JOIN 
    CLIENTE C ON F.ID_CLIENTE = C.ID_CLIENTE
JOIN 
    EMPLEADO E ON E.ID_EMPLEADO = E.ID_EMPLEADO
JOIN 
    CARGO CG ON E.ID_CARGO = CG.ID_CARGO
JOIN 
    PRODUCTO P ON DF.ID_PRODUCTO = P.ID_PRODUCTO
JOIN 
    RECIBO R ON F.ID_CLIENTE = R.ID_CLIENTE
JOIN 
    SUCURSAL S ON R.ID_SUCURSAL = S.ID_SUCURSAL
GROUP BY 
    DF.ID_FACTURA
ORDER BY 
    DF.ID_FACTURA ASC;