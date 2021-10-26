SELECT
     proceso.`IdProceso` AS proceso_IdProceso,
     proceso.`DescripcionProceso` AS proceso_DescripcionProceso,
     proceso.`PrendasRealizadas` AS proceso_PrendasRealizadas,
     proceso.`EstadoProceso` AS proceso_EstadoProceso,
     tercera_vista.`NombreDatos` AS tercera_vista_NombreDatos,
     tercera_vista.`ApellidoDatos` AS tercera_vista_ApellidoDatos,
     tercera_vista.`FechaProceso` AS tercera_vista_FechaProceso,
     tercera_vista.`HoraInicio` AS tercera_vista_HoraInicio,
     tercera_vista.`HoraFin` AS tercera_vista_HoraFin,
     tercera_vista.`TiempoHoras` AS tercera_vista_TiempoHoras
FROM
     `tercera_vista` tercera_vista,
     `proceso` proceso