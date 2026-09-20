.class public final Lsm6;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Lsm6;

.field public static final b:Lji8;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lsm6;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lsm6;->a:Lsm6;

    .line 7
    .line 8
    new-instance v0, Lam3;

    .line 9
    .line 10
    invoke-direct {v0}, Lam3;-><init>()V

    .line 11
    .line 12
    .line 13
    const-class v1, Lrm6;

    .line 14
    .line 15
    sget-object v2, Lty;->a:Lty;

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Lam3;->a(Ljava/lang/Class;Lq25;)Ll42;

    .line 18
    .line 19
    .line 20
    const-class v1, Lym6;

    .line 21
    .line 22
    sget-object v2, Luy;->a:Luy;

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Lam3;->a(Ljava/lang/Class;Lq25;)Ll42;

    .line 25
    .line 26
    .line 27
    const-class v1, Lke1;

    .line 28
    .line 29
    sget-object v2, Lry;->a:Lry;

    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, Lam3;->a(Ljava/lang/Class;Lq25;)Ll42;

    .line 32
    .line 33
    .line 34
    const-class v1, Lhr;

    .line 35
    .line 36
    sget-object v2, Lqy;->a:Lqy;

    .line 37
    .line 38
    invoke-virtual {v0, v1, v2}, Lam3;->a(Ljava/lang/Class;Lq25;)Ll42;

    .line 39
    .line 40
    .line 41
    const-class v1, Ljd;

    .line 42
    .line 43
    sget-object v2, Lpy;->a:Lpy;

    .line 44
    .line 45
    invoke-virtual {v0, v1, v2}, Lam3;->a(Ljava/lang/Class;Lq25;)Ll42;

    .line 46
    .line 47
    .line 48
    const-class v1, Lep5;

    .line 49
    .line 50
    sget-object v2, Lsy;->a:Lsy;

    .line 51
    .line 52
    invoke-virtual {v0, v1, v2}, Lam3;->a(Ljava/lang/Class;Lq25;)Ll42;

    .line 53
    .line 54
    .line 55
    const/4 v1, 0x1

    .line 56
    iput-boolean v1, v0, Lam3;->d:Z

    .line 57
    .line 58
    new-instance v1, Lji8;

    .line 59
    .line 60
    const/16 v2, 0x1b

    .line 61
    .line 62
    invoke-direct {v1, v2, v0}, Lji8;-><init>(ILjava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    sput-object v1, Lsm6;->b:Lji8;

    .line 66
    .line 67
    return-void
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
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

.method public static a(Loe2;)Lhr;
    .locals 9

    .line 1
    invoke-virtual {p0}, Loe2;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Loe2;->a:Landroid/content/Context;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 23
    .line 24
    const/16 v4, 0x1c

    .line 25
    .line 26
    if-lt v3, v4, :cond_0

    .line 27
    .line 28
    invoke-static {v1}, Lq4;->c(Landroid/content/pm/PackageInfo;)J

    .line 29
    .line 30
    .line 31
    move-result-wide v3

    .line 32
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    :goto_0
    move-object v4, v3

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    iget v3, v1, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 39
    .line 40
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    goto :goto_0

    .line 45
    :goto_1
    new-instance v7, Lhr;

    .line 46
    .line 47
    invoke-virtual {p0}, Loe2;->a()V

    .line 48
    .line 49
    .line 50
    iget-object v3, p0, Loe2;->c:Lcf2;

    .line 51
    .line 52
    iget-object v8, v3, Lcf2;->b:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    sget-object v3, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    sget-object v3, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    move-object v3, v1

    .line 68
    new-instance v1, Ljd;

    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    iget-object v3, v3, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 74
    .line 75
    if-nez v3, :cond_1

    .line 76
    .line 77
    move-object v3, v4

    .line 78
    :cond_1
    sget-object v5, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Loe2;->a()V

    .line 84
    .line 85
    .line 86
    invoke-static {v0}, Lo85;->h(Landroid/content/Context;)Lep5;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    invoke-virtual {p0}, Loe2;->a()V

    .line 91
    .line 92
    .line 93
    invoke-static {v0}, Lo85;->g(Landroid/content/Context;)Ljava/util/ArrayList;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    invoke-direct/range {v1 .. v6}, Ljd;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lep5;Ljava/util/ArrayList;)V

    .line 98
    .line 99
    .line 100
    invoke-direct {v7, v8, v1}, Lhr;-><init>(Ljava/lang/String;Ljd;)V

    .line 101
    .line 102
    .line 103
    return-object v7
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
.end method
