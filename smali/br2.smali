.class public final Lbr2;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lry2;
.implements Lif6;
.implements La68;


# instance fields
.field public A:Lw54;

.field public B:Lkg5;

.field public final w:Lbq2;

.field public final x:Lz58;

.field public final y:Ly0;

.field public z:Lw58;


# direct methods
.method public constructor <init>(Lbq2;Lz58;Ly0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lbr2;->A:Lw54;

    .line 6
    .line 7
    iput-object v0, p0, Lbr2;->B:Lkg5;

    .line 8
    .line 9
    iput-object p1, p0, Lbr2;->w:Lbq2;

    .line 10
    .line 11
    iput-object p2, p0, Lbr2;->x:Lz58;

    .line 12
    .line 13
    iput-object p3, p0, Lbr2;->y:Ly0;

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
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
    .line 64
    .line 65
    .line 66
    .line 67
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
.end method


# virtual methods
.method public final a(Lj54;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lbr2;->A:Lw54;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lw54;->f1(Lj54;)V

    .line 4
    .line 5
    .line 6
    return-void
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final c()Lw58;
    .locals 4

    .line 1
    iget-object v0, p0, Lbr2;->w:Lbq2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lbq2;->c()Lw58;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, v0, Lbq2;->o0:Ljf6;

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    iput-object v1, p0, Lbr2;->z:Lw58;

    .line 16
    .line 17
    return-object v1

    .line 18
    :cond_0
    iget-object v1, p0, Lbr2;->z:Lw58;

    .line 19
    .line 20
    if-nez v1, :cond_3

    .line 21
    .line 22
    invoke-virtual {v0}, Lbq2;->L()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    :goto_0
    instance-of v2, v1, Landroid/content/ContextWrapper;

    .line 31
    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    instance-of v2, v1, Landroid/app/Application;

    .line 35
    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    check-cast v1, Landroid/app/Application;

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    check-cast v1, Landroid/content/ContextWrapper;

    .line 42
    .line 43
    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    goto :goto_0

    .line 48
    :cond_2
    const/4 v1, 0x0

    .line 49
    :goto_1
    new-instance v2, Ljf6;

    .line 50
    .line 51
    iget-object v3, v0, Lbq2;->B:Landroid/os/Bundle;

    .line 52
    .line 53
    invoke-direct {v2, v1, v0, v3}, Ljf6;-><init>(Landroid/app/Application;Lif6;Landroid/os/Bundle;)V

    .line 54
    .line 55
    .line 56
    iput-object v2, p0, Lbr2;->z:Lw58;

    .line 57
    .line 58
    :cond_3
    iget-object p0, p0, Lbr2;->z:Lw58;

    .line 59
    .line 60
    return-object p0
    .line 61
    .line 62
    .line 63
.end method

.method public final d()Lto4;
    .locals 5

    .line 1
    iget-object v0, p0, Lbr2;->w:Lbq2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lbq2;->L()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    :goto_0
    instance-of v2, v1, Landroid/content/ContextWrapper;

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    instance-of v2, v1, Landroid/app/Application;

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    check-cast v1, Landroid/app/Application;

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    check-cast v1, Landroid/content/ContextWrapper;

    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 v1, 0x0

    .line 30
    :goto_1
    new-instance v2, Lto4;

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    invoke-direct {v2, v3}, Lto4;-><init>(I)V

    .line 34
    .line 35
    .line 36
    iget-object v3, v2, Lib1;->a:Ljava/util/LinkedHashMap;

    .line 37
    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    sget-object v4, Lv58;->d:Lor2;

    .line 41
    .line 42
    invoke-interface {v3, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    :cond_2
    sget-object v1, Lcf6;->a:Ls63;

    .line 46
    .line 47
    invoke-interface {v3, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    sget-object v1, Lcf6;->b:Lhr2;

    .line 51
    .line 52
    invoke-interface {v3, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    iget-object p0, v0, Lbq2;->B:Landroid/os/Bundle;

    .line 56
    .line 57
    if-eqz p0, :cond_3

    .line 58
    .line 59
    sget-object v0, Lcf6;->c:Lor2;

    .line 60
    .line 61
    invoke-interface {v3, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    :cond_3
    return-object v2
    .line 65
    .line 66
    .line 67
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

.method public final e()V
    .locals 3

    .line 1
    iget-object v0, p0, Lbr2;->A:Lw54;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lw54;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, p0, v1}, Lw54;-><init>(Lt54;Z)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lbr2;->A:Lw54;

    .line 12
    .line 13
    new-instance v0, Lhf6;

    .line 14
    .line 15
    new-instance v1, Lhx4;

    .line 16
    .line 17
    const/16 v2, 0x12

    .line 18
    .line 19
    invoke-direct {v1, v2, p0}, Lhx4;-><init>(ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, p0, v1}, Lhf6;-><init>(Lif6;Lhx4;)V

    .line 23
    .line 24
    .line 25
    new-instance v1, Lkg5;

    .line 26
    .line 27
    invoke-direct {v1, v0}, Lkg5;-><init>(Lhf6;)V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, Lbr2;->B:Lkg5;

    .line 31
    .line 32
    invoke-virtual {v1}, Lkg5;->F()V

    .line 33
    .line 34
    .line 35
    iget-object p0, p0, Lbr2;->y:Ly0;

    .line 36
    .line 37
    invoke-virtual {p0}, Ly0;->run()V

    .line 38
    .line 39
    .line 40
    :cond_0
    return-void
    .line 41
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

.method public final g()Lz58;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lbr2;->e()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lbr2;->x:Lz58;

    .line 5
    .line 6
    return-object p0
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

.method public final h()Lkg5;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lbr2;->e()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lbr2;->B:Lkg5;

    .line 5
    .line 6
    iget-object p0, p0, Lkg5;->y:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lkg5;

    .line 9
    .line 10
    return-object p0
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

.method public final k()Lin8;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lbr2;->e()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lbr2;->A:Lw54;

    .line 5
    .line 6
    return-object p0
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
