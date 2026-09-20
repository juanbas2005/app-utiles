.class public abstract Lea0;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Lau;

.field public static final b:Lau;

.field public static final c:Lwr0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    sget-object v0, Lb26;->a:Lc26;

    .line 2
    .line 3
    const-class v1, Lsq5;

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
    const-string v3, "UploadProgressListenerAttributeKey"

    .line 24
    .line 25
    invoke-direct {v0, v3, v4}, Lau;-><init>(Ljava/lang/String;Lfp7;)V

    .line 26
    .line 27
    .line 28
    sput-object v0, Lea0;->a:Lau;

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
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 40
    :catchall_1
    new-instance v1, Lfp7;

    .line 41
    .line 42
    invoke-direct {v1, v0, v2}, Lfp7;-><init>(Lgq3;Las3;)V

    .line 43
    .line 44
    .line 45
    new-instance v0, Lau;

    .line 46
    .line 47
    const-string v2, "DownloadProgressListenerAttributeKey"

    .line 48
    .line 49
    invoke-direct {v0, v2, v1}, Lau;-><init>(Ljava/lang/String;Lfp7;)V

    .line 50
    .line 51
    .line 52
    sput-object v0, Lea0;->b:Lau;

    .line 53
    .line 54
    new-instance v0, Lj5;

    .line 55
    .line 56
    const/16 v1, 0xf

    .line 57
    .line 58
    invoke-direct {v0, v1}, Lj5;-><init>(I)V

    .line 59
    .line 60
    .line 61
    new-instance v1, Lo;

    .line 62
    .line 63
    const/16 v2, 0x14

    .line 64
    .line 65
    invoke-direct {v1, v2}, Lo;-><init>(I)V

    .line 66
    .line 67
    .line 68
    new-instance v2, Lwr0;

    .line 69
    .line 70
    const-string v3, "BodyProgress"

    .line 71
    .line 72
    invoke-direct {v2, v3, v1, v0}, Lwr0;-><init>(Ljava/lang/String;Lsr2;Lvr2;)V

    .line 73
    .line 74
    .line 75
    sput-object v2, Lea0;->c:Lwr0;

    .line 76
    .line 77
    return-void
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
