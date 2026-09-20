.class public final Lvz7;
.super Lyz7;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Lvz7;

.field public static final b:Laz7;

.field public static final c:Ljava/lang/String;

.field public static final d:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lvz7;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lvz7;->a:Lvz7;

    .line 7
    .line 8
    sget-object v0, Laz7;->x:Laz7;

    .line 9
    .line 10
    sput-object v0, Lvz7;->b:Laz7;

    .line 11
    .line 12
    const-string v0, "Saldo: 0.0 CUP. Datos: 0.0 GB. Voz: 00:00:00. Linea activa hasta 00-00-00 vence 00-00-27."

    .line 13
    .line 14
    sput-object v0, Lvz7;->c:Ljava/lang/String;

    .line 15
    .line 16
    new-instance v0, Lk26;

    .line 17
    .line 18
    const-string v1, "Saldo:\\s*([\\d.]+)\\s*CUP"

    .line 19
    .line 20
    invoke-direct {v0, v1}, Lk26;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    new-instance v2, Lyb5;

    .line 24
    .line 25
    const-string v1, "saldo"

    .line 26
    .line 27
    invoke-direct {v2, v1, v0}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    new-instance v0, Lk26;

    .line 31
    .line 32
    const-string v1, "Datos:\\s*([\\d.]+\\s*(?:GB|MB))(?:\\s*\\+|\\.)"

    .line 33
    .line 34
    invoke-direct {v0, v1}, Lk26;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    new-instance v3, Lyb5;

    .line 38
    .line 39
    const-string v1, "datos"

    .line 40
    .line 41
    invoke-direct {v3, v1, v0}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    new-instance v0, Lk26;

    .line 45
    .line 46
    const-string v1, "\\+\\s*([\\d.]+\\s*(?:GB|MB))\\s*LTE"

    .line 47
    .line 48
    invoke-direct {v0, v1}, Lk26;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    new-instance v4, Lyb5;

    .line 52
    .line 53
    const-string v1, "datosLte"

    .line 54
    .line 55
    invoke-direct {v4, v1, v0}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    new-instance v0, Lk26;

    .line 59
    .line 60
    const-string v1, "Voz:\\s*(\\d{2}:\\d{2}:\\d{2})"

    .line 61
    .line 62
    invoke-direct {v0, v1}, Lk26;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    new-instance v5, Lyb5;

    .line 66
    .line 67
    const-string v1, "voz"

    .line 68
    .line 69
    invoke-direct {v5, v1, v0}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    new-instance v0, Lk26;

    .line 73
    .line 74
    const-string v1, "activa hasta\\s*([\\d-]+)"

    .line 75
    .line 76
    invoke-direct {v0, v1}, Lk26;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    new-instance v6, Lyb5;

    .line 80
    .line 81
    const-string v1, "fechaActiva"

    .line 82
    .line 83
    invoke-direct {v6, v1, v0}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    new-instance v0, Lk26;

    .line 87
    .line 88
    const-string v1, "vence\\s*([\\d-]+)"

    .line 89
    .line 90
    invoke-direct {v0, v1}, Lk26;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    new-instance v7, Lyb5;

    .line 94
    .line 95
    const-string v1, "fechaVence"

    .line 96
    .line 97
    invoke-direct {v7, v1, v0}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    filled-new-array/range {v2 .. v7}, [Lyb5;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-static {v0}, Lsf4;->V([Lyb5;)Ljava/util/Map;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    sput-object v0, Lvz7;->d:Ljava/util/Map;

    .line 109
    .line 110
    return-void
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 0

    .line 1
    sget-object p0, Lvz7;->d:Ljava/util/Map;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final b()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lvz7;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final c()Laz7;
    .locals 0

    .line 1
    sget-object p0, Lvz7;->b:Laz7;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
