.class public abstract Lhx1;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Lau;

.field public static final b:Lau;

.field public static final c:Lz97;

.field public static final d:Lwr0;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    sget-object v0, Lb26;->a:Lc26;

    .line 2
    .line 3
    const-class v1, Lvs7;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v2, 0x0

    .line 10
    :try_start_0
    invoke-static {v1}, Lb26;->b(Ljava/lang/Class;)Las3;

    .line 11
    .line 12
    .line 13
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-object v3, v2

    .line 16
    :goto_0
    new-instance v4, Lfp7;

    .line 17
    .line 18
    invoke-direct {v4, v0, v3}, Lfp7;-><init>(Lgq3;Las3;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Lau;

    .line 22
    .line 23
    const-string v3, "SkipSaveBody"

    .line 24
    .line 25
    invoke-direct {v0, v3, v4}, Lau;-><init>(Ljava/lang/String;Lfp7;)V

    .line 26
    .line 27
    .line 28
    sput-object v0, Lhx1;->a:Lau;

    .line 29
    .line 30
    sget-object v0, Lb26;->a:Lc26;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    :try_start_1
    invoke-static {v1}, Lb26;->b(Ljava/lang/Class;)Las3;

    .line 37
    .line 38
    .line 39
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 40
    goto :goto_1

    .line 41
    :catchall_1
    move-object v1, v2

    .line 42
    :goto_1
    new-instance v3, Lfp7;

    .line 43
    .line 44
    invoke-direct {v3, v0, v1}, Lfp7;-><init>(Lgq3;Las3;)V

    .line 45
    .line 46
    .line 47
    new-instance v0, Lau;

    .line 48
    .line 49
    const-string v1, "ResponseBodySaved"

    .line 50
    .line 51
    invoke-direct {v0, v1, v3}, Lau;-><init>(Ljava/lang/String;Lfp7;)V

    .line 52
    .line 53
    .line 54
    sput-object v0, Lhx1;->b:Lau;

    .line 55
    .line 56
    new-instance v0, Lnf1;

    .line 57
    .line 58
    const/4 v1, 0x7

    .line 59
    invoke-direct {v0, v1}, Lnf1;-><init>(I)V

    .line 60
    .line 61
    .line 62
    new-instance v1, Lz97;

    .line 63
    .line 64
    invoke-direct {v1, v0}, Lz97;-><init>(Lsr2;)V

    .line 65
    .line 66
    .line 67
    sput-object v1, Lhx1;->c:Lz97;

    .line 68
    .line 69
    new-instance v0, Lf81;

    .line 70
    .line 71
    const/16 v1, 0x19

    .line 72
    .line 73
    invoke-direct {v0, v1}, Lf81;-><init>(I)V

    .line 74
    .line 75
    .line 76
    new-instance v1, Lo;

    .line 77
    .line 78
    const/16 v3, 0x14

    .line 79
    .line 80
    invoke-direct {v1, v3}, Lo;-><init>(I)V

    .line 81
    .line 82
    .line 83
    new-instance v3, Lwr0;

    .line 84
    .line 85
    const-string v4, "SaveBody"

    .line 86
    .line 87
    invoke-direct {v3, v4, v1, v0}, Lwr0;-><init>(Ljava/lang/String;Lsr2;Lvr2;)V

    .line 88
    .line 89
    .line 90
    sput-object v3, Lhx1;->d:Lwr0;

    .line 91
    .line 92
    sget v0, Lgx1;->D:I

    .line 93
    .line 94
    sget-object v0, Lb26;->a:Lc26;

    .line 95
    .line 96
    const-class v1, Lxr0;

    .line 97
    .line 98
    invoke-virtual {v0, v1}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    :try_start_2
    sget-object v4, Lgs3;->c:Lgs3;

    .line 103
    .line 104
    const-class v4, Lwr0;

    .line 105
    .line 106
    invoke-virtual {v0, v4}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    invoke-virtual {v0, v4}, Lc26;->n(Lgq3;)Lcs3;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    const-class v5, Ljava/lang/Object;

    .line 115
    .line 116
    invoke-static {v5}, Lb26;->b(Ljava/lang/Class;)Las3;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    invoke-static {v5}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    invoke-virtual {v0, v4, v5}, Lc26;->l(Lcs3;Ljava/util/List;)V

    .line 125
    .line 126
    .line 127
    sget-object v5, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 128
    .line 129
    const/4 v6, 0x0

    .line 130
    invoke-virtual {v0, v4, v5, v6}, Lc26;->m(Lvq3;Ljava/util/List;Z)Las3;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-static {v0}, Lx91;->C(Las3;)Lgs3;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-static {v1, v0}, Lb26;->c(Ljava/lang/Class;Lgs3;)Las3;

    .line 139
    .line 140
    .line 141
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 142
    :catchall_2
    new-instance v0, Lfp7;

    .line 143
    .line 144
    invoke-direct {v0, v3, v2}, Lfp7;-><init>(Lgq3;Las3;)V

    .line 145
    .line 146
    .line 147
    new-instance v1, Lau;

    .line 148
    .line 149
    const-string v2, "DoubleReceivePlugin"

    .line 150
    .line 151
    invoke-direct {v1, v2, v0}, Lau;-><init>(Ljava/lang/String;Lfp7;)V

    .line 152
    .line 153
    .line 154
    return-void
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

.method public static final a()Lcc4;
    .locals 1

    .line 1
    sget-object v0, Lhx1;->c:Lz97;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz97;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcc4;

    .line 8
    .line 9
    return-object v0
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
