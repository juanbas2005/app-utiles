.class public abstract Lom;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Luq4;

.field public static final b:Luq4;

.field public static final c:Luq4;

.field public static final d:Luq4;

.field public static final e:Luq4;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "message"

    .line 2
    .line 3
    invoke-static {v0}, Luq4;->e(Ljava/lang/String;)Luq4;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lom;->a:Luq4;

    .line 8
    .line 9
    const-string v0, "replaceWith"

    .line 10
    .line 11
    invoke-static {v0}, Luq4;->e(Ljava/lang/String;)Luq4;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lom;->b:Luq4;

    .line 16
    .line 17
    const-string v0, "level"

    .line 18
    .line 19
    invoke-static {v0}, Luq4;->e(Ljava/lang/String;)Luq4;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lom;->c:Luq4;

    .line 24
    .line 25
    const-string v0, "expression"

    .line 26
    .line 27
    invoke-static {v0}, Luq4;->e(Ljava/lang/String;)Luq4;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lom;->d:Luq4;

    .line 32
    .line 33
    const-string v0, "imports"

    .line 34
    .line 35
    invoke-static {v0}, Luq4;->e(Ljava/lang/String;)Luq4;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Lom;->e:Luq4;

    .line 40
    .line 41
    return-void
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public static final a(Lfv3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljd0;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljd0;

    .line 5
    .line 6
    sget-object v1, Lm27;->o:Lup2;

    .line 7
    .line 8
    new-instance v2, Lx47;

    .line 9
    .line 10
    invoke-direct {v2, p2}, Le21;-><init>(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    new-instance p2, Lyb5;

    .line 14
    .line 15
    sget-object v3, Lom;->d:Luq4;

    .line 16
    .line 17
    invoke-direct {p2, v3, v2}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    new-instance v2, Lps;

    .line 21
    .line 22
    new-instance v3, Lnm;

    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    invoke-direct {v3, p0, v4}, Lnm;-><init>(Lfv3;I)V

    .line 26
    .line 27
    .line 28
    sget-object v4, La42;->w:La42;

    .line 29
    .line 30
    invoke-direct {v2, v4, v3}, Lps;-><init>(Ljava/util/List;Lvr2;)V

    .line 31
    .line 32
    .line 33
    new-instance v3, Lyb5;

    .line 34
    .line 35
    sget-object v4, Lom;->e:Luq4;

    .line 36
    .line 37
    invoke-direct {v3, v4, v2}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    filled-new-array {p2, v3}, [Lyb5;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    invoke-static {p2}, Lsf4;->V([Lyb5;)Ljava/util/Map;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-direct {v0, p0, v1, p2}, Ljd0;-><init>(Lfv3;Lup2;Ljava/util/Map;)V

    .line 49
    .line 50
    .line 51
    new-instance p2, Ljd0;

    .line 52
    .line 53
    sget-object v1, Lm27;->m:Lup2;

    .line 54
    .line 55
    new-instance v2, Lx47;

    .line 56
    .line 57
    invoke-direct {v2, p1}, Le21;-><init>(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    new-instance p1, Lyb5;

    .line 61
    .line 62
    sget-object v3, Lom;->a:Luq4;

    .line 63
    .line 64
    invoke-direct {p1, v3, v2}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    new-instance v2, Lpm;

    .line 68
    .line 69
    invoke-direct {v2, v0}, Le21;-><init>(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    new-instance v0, Lyb5;

    .line 73
    .line 74
    sget-object v3, Lom;->b:Luq4;

    .line 75
    .line 76
    invoke-direct {v0, v3, v2}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    new-instance v2, Lb62;

    .line 80
    .line 81
    sget-object v3, Lm27;->n:Lup2;

    .line 82
    .line 83
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    new-instance v4, Lgq0;

    .line 87
    .line 88
    invoke-virtual {v3}, Lup2;->b()Lup2;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    iget-object v3, v3, Lup2;->a:Lvp2;

    .line 93
    .line 94
    invoke-virtual {v3}, Lvp2;->g()Luq4;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-direct {v4, v5, v3}, Lgq0;-><init>(Lup2;Luq4;)V

    .line 99
    .line 100
    .line 101
    invoke-static {p3}, Luq4;->e(Ljava/lang/String;)Luq4;

    .line 102
    .line 103
    .line 104
    move-result-object p3

    .line 105
    invoke-direct {v2, v4, p3}, Lb62;-><init>(Lgq0;Luq4;)V

    .line 106
    .line 107
    .line 108
    new-instance p3, Lyb5;

    .line 109
    .line 110
    sget-object v3, Lom;->c:Luq4;

    .line 111
    .line 112
    invoke-direct {p3, v3, v2}, Lyb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    filled-new-array {p1, v0, p3}, [Lyb5;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-static {p1}, Lsf4;->V([Lyb5;)Ljava/util/Map;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-direct {p2, p0, v1, p1}, Ljd0;-><init>(Lfv3;Lup2;Ljava/util/Map;)V

    .line 124
    .line 125
    .line 126
    return-object p2
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
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method
