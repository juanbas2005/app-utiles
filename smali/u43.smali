.class public abstract Lu43;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Lau;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    sget-object v0, Lb26;->a:Lc26;

    .line 2
    .line 3
    const-class v1, Ljava/util/Map;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    :try_start_0
    const-class v3, Lt43;

    .line 10
    .line 11
    sget-object v4, Lgs3;->c:Lgs3;

    .line 12
    .line 13
    invoke-static {v3, v4}, Lb26;->c(Ljava/lang/Class;Lgs3;)Las3;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-static {v3}, Lx91;->C(Las3;)Lgs3;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const-class v4, Ljava/lang/Object;

    .line 22
    .line 23
    invoke-static {v4}, Lb26;->b(Ljava/lang/Class;)Las3;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-static {v4}, Lx91;->C(Las3;)Lgs3;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-virtual {v0, v1}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    filled-new-array {v3, v4}, [Lgs3;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    const/4 v4, 0x0

    .line 44
    invoke-virtual {v0, v1, v3, v4}, Lc26;->m(Lvq3;Ljava/util/List;Z)Las3;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v0, v1}, Lc26;->d(Las3;)Las3;

    .line 49
    .line 50
    .line 51
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    const/4 v0, 0x0

    .line 54
    :goto_0
    new-instance v1, Lfp7;

    .line 55
    .line 56
    invoke-direct {v1, v2, v0}, Lfp7;-><init>(Lgq3;Las3;)V

    .line 57
    .line 58
    .line 59
    new-instance v0, Lau;

    .line 60
    .line 61
    const-string v2, "EngineCapabilities"

    .line 62
    .line 63
    invoke-direct {v0, v2, v1}, Lau;-><init>(Ljava/lang/String;Lfp7;)V

    .line 64
    .line 65
    .line 66
    sput-object v0, Lu43;->a:Lau;

    .line 67
    .line 68
    sget-object v0, Lx63;->a:Lx63;

    .line 69
    .line 70
    invoke-static {v0}, Lwn6;->w(Ljava/lang/Object;)Ljava/util/Set;

    .line 71
    .line 72
    .line 73
    return-void
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
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
