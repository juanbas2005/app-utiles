.class public Ly80;
.super Lbq2;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public t0:Lf90;

.field public final u0:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lbq2;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Ly80;->u0:Landroid/os/Handler;

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public final G()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lbq2;->a0:Z

    .line 3
    .line 4
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v2, 0x1d

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Ly80;->t0:Lf90;

    .line 11
    .line 12
    invoke-virtual {v1}, Lf90;->e()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-static {v1}, Luq3;->A(I)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    iget-object v1, p0, Ly80;->t0:Lf90;

    .line 23
    .line 24
    iput-boolean v0, v1, Lf90;->n:Z

    .line 25
    .line 26
    new-instance v0, Lx80;

    .line 27
    .line 28
    const/4 v2, 0x2

    .line 29
    invoke-direct {v0, v1, v2}, Lx80;-><init>(Lf90;I)V

    .line 30
    .line 31
    .line 32
    const-wide/16 v1, 0xfa

    .line 33
    .line 34
    iget-object p0, p0, Ly80;->u0:Landroid/os/Handler;

    .line 35
    .line 36
    invoke-virtual {p0, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void
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
.end method

.method public final H()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lbq2;->a0:Z

    .line 3
    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v1, 0x1d

    .line 7
    .line 8
    if-ge v0, v1, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Ly80;->t0:Lf90;

    .line 11
    .line 12
    iget-boolean v0, v0, Lf90;->l:Z

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, Lbq2;->l()Leq2;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v0, 0x0

    .line 30
    invoke-virtual {p0, v0}, Ly80;->P(I)V

    .line 31
    .line 32
    .line 33
    :cond_1
    :goto_0
    return-void
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
.end method

.method public final P(I)V
    .locals 2

    .line 1
    const/4 v0, 0x3

    .line 2
    if-eq p1, v0, :cond_0

    .line 3
    .line 4
    iget-object v0, p0, Ly80;->t0:Lf90;

    .line 5
    .line 6
    iget-boolean v0, v0, Lf90;->n:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    invoke-virtual {p0}, Ly80;->T()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Ly80;->t0:Lf90;

    .line 18
    .line 19
    iput p1, v0, Lf90;->i:I

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    if-ne p1, v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0}, Lbq2;->n()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/16 v0, 0xa

    .line 29
    .line 30
    invoke-static {p1, v0}, Lgw8;->w(Landroid/content/Context;I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p0, v0, p1}, Ly80;->W(ILjava/lang/CharSequence;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    iget-object p0, p0, Ly80;->t0:Lf90;

    .line 38
    .line 39
    iget-object p1, p0, Lf90;->f:Lf96;

    .line 40
    .line 41
    if-nez p1, :cond_2

    .line 42
    .line 43
    new-instance p1, Lf96;

    .line 44
    .line 45
    const/16 v0, 0x9

    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    invoke-direct {p1, v0, v1}, Lf96;-><init>(IZ)V

    .line 49
    .line 50
    .line 51
    iput-object p1, p0, Lf90;->f:Lf96;

    .line 52
    .line 53
    :cond_2
    iget-object p0, p0, Lf90;->f:Lf96;

    .line 54
    .line 55
    iget-object p1, p0, Lf96;->x:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p1, Landroid/os/CancellationSignal;

    .line 58
    .line 59
    if-eqz p1, :cond_3

    .line 60
    .line 61
    :try_start_0
    invoke-static {p1}, Lnk0;->a(Landroid/os/CancellationSignal;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :catch_0
    move-exception p1

    .line 66
    const-string v0, "Got NPE while canceling biometric authentication."

    .line 67
    .line 68
    const-string v1, "CancelSignalProvider"

    .line 69
    .line 70
    invoke-static {v1, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 71
    .line 72
    .line 73
    :goto_0
    const/4 p1, 0x0

    .line 74
    iput-object p1, p0, Lf96;->x:Ljava/lang/Object;

    .line 75
    .line 76
    :cond_3
    :goto_1
    return-void
.end method

.method public final Q()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Ly80;->R()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ly80;->t0:Lf90;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput-boolean v1, v0, Lf90;->j:Z

    .line 8
    .line 9
    iget-boolean v0, v0, Lf90;->l:Z

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Lbq2;->t()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Lbq2;->p()Lrq2;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v3, Lq30;

    .line 25
    .line 26
    invoke-direct {v3, v0}, Lq30;-><init>(Lrq2;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3, p0}, Lq30;->h(Lbq2;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3, v2, v2}, Lq30;->e(ZZ)I

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-virtual {p0}, Lbq2;->n()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-eqz v0, :cond_4

    .line 40
    .line 41
    sget-object v3, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 42
    .line 43
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 44
    .line 45
    const/16 v5, 0x1d

    .line 46
    .line 47
    if-eq v4, v5, :cond_1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    if-nez v3, :cond_2

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    const v4, 0x7f030003

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    array-length v4, v0

    .line 65
    :goto_0
    if-ge v1, v4, :cond_4

    .line 66
    .line 67
    aget-object v5, v0, v1

    .line 68
    .line 69
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    if-eqz v5, :cond_3

    .line 74
    .line 75
    iget-object v0, p0, Ly80;->t0:Lf90;

    .line 76
    .line 77
    iput-boolean v2, v0, Lf90;->m:Z

    .line 78
    .line 79
    new-instance v1, Lx80;

    .line 80
    .line 81
    invoke-direct {v1, v0, v2}, Lx80;-><init>(Lf90;I)V

    .line 82
    .line 83
    .line 84
    const-wide/16 v2, 0x258

    .line 85
    .line 86
    iget-object p0, p0, Ly80;->u0:Landroid/os/Handler;

    .line 87
    .line 88
    invoke-virtual {p0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_4
    :goto_1
    return-void
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

.method public final R()V
    .locals 2

    .line 1
    iget-object v0, p0, Ly80;->t0:Lf90;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, v0, Lf90;->j:Z

    .line 5
    .line 6
    invoke-virtual {p0}, Lbq2;->t()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lbq2;->p()Lrq2;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const-string v0, "androidx.biometric.FingerprintDialogFragment"

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lrq2;->E(Ljava/lang/String;)Lbq2;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Lhe2;

    .line 23
    .line 24
    :cond_0
    return-void
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
.end method

.method public final S()Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    if-gt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Ly80;->t0:Lf90;

    .line 8
    .line 9
    invoke-virtual {p0}, Lf90;->e()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    invoke-static {p0}, Luq3;->A(I)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0
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
.end method

.method public final T()Z
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/16 v2, 0x1c

    .line 5
    .line 6
    if-lt v0, v2, :cond_3

    .line 7
    .line 8
    invoke-virtual {p0}, Lbq2;->n()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    iget-object v3, p0, Ly80;->t0:Lf90;

    .line 15
    .line 16
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    :cond_0
    const/4 v3, 0x0

    .line 20
    if-ne v0, v2, :cond_2

    .line 21
    .line 22
    iget-object v0, p0, Lbq2;->B:Landroid/os/Bundle;

    .line 23
    .line 24
    invoke-virtual {p0}, Lbq2;->n()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-static {p0}, Lea5;->a(Landroid/content/pm/PackageManager;)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-eqz p0, :cond_1

    .line 45
    .line 46
    move p0, v1

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    move p0, v3

    .line 49
    :goto_0
    const-string v2, "has_fingerprint"

    .line 50
    .line 51
    invoke-virtual {v0, v2, p0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-nez p0, :cond_2

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    return v3

    .line 59
    :cond_3
    :goto_1
    return v1
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public final U()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lbq2;->n()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-static {v0}, Lht3;->a(Landroid/content/Context;)Landroid/app/KeyguardManager;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v1

    .line 14
    :goto_0
    if-nez v0, :cond_1

    .line 15
    .line 16
    const v0, 0x7f110154

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lbq2;->q(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/16 v1, 0xc

    .line 24
    .line 25
    invoke-virtual {p0, v1, v0}, Ly80;->V(ILjava/lang/CharSequence;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    iget-object v2, p0, Ly80;->t0:Lf90;

    .line 30
    .line 31
    iget-object v3, v2, Lf90;->d:Lqc3;

    .line 32
    .line 33
    if-eqz v3, :cond_2

    .line 34
    .line 35
    iget-object v4, v3, Lqc3;->x:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v4, Ljava/lang/CharSequence;

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    move-object v4, v1

    .line 41
    :goto_1
    if-eqz v3, :cond_3

    .line 42
    .line 43
    iget-object v3, v3, Lqc3;->y:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v3, Ljava/lang/CharSequence;

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_3
    move-object v3, v1

    .line 49
    :goto_2
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    if-eqz v3, :cond_4

    .line 53
    .line 54
    move-object v1, v3

    .line 55
    :cond_4
    invoke-static {v0, v4, v1}, Ls80;->a(Landroid/app/KeyguardManager;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    if-nez v0, :cond_5

    .line 60
    .line 61
    const v0, 0x7f110153

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, v0}, Lbq2;->q(I)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    const/16 v1, 0xe

    .line 69
    .line 70
    invoke-virtual {p0, v1, v0}, Ly80;->V(ILjava/lang/CharSequence;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_5
    iget-object v1, p0, Ly80;->t0:Lf90;

    .line 75
    .line 76
    const/4 v2, 0x1

    .line 77
    iput-boolean v2, v1, Lf90;->l:Z

    .line 78
    .line 79
    invoke-virtual {p0}, Ly80;->T()Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eqz v1, :cond_6

    .line 84
    .line 85
    invoke-virtual {p0}, Ly80;->R()V

    .line 86
    .line 87
    .line 88
    :cond_6
    const/high16 v1, 0x8080000

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 91
    .line 92
    .line 93
    iget-object v1, p0, Lbq2;->Q:Ldq2;

    .line 94
    .line 95
    if-eqz v1, :cond_8

    .line 96
    .line 97
    invoke-virtual {p0}, Lbq2;->p()Lrq2;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    iget-object v3, v1, Lrq2;->C:La9;

    .line 102
    .line 103
    if-eqz v3, :cond_7

    .line 104
    .line 105
    new-instance v3, Lnq2;

    .line 106
    .line 107
    iget-object p0, p0, Lbq2;->A:Ljava/lang/String;

    .line 108
    .line 109
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 110
    .line 111
    .line 112
    iput-object p0, v3, Lnq2;->w:Ljava/lang/String;

    .line 113
    .line 114
    iput v2, v3, Lnq2;->x:I

    .line 115
    .line 116
    iget-object p0, v1, Lrq2;->F:Ljava/util/ArrayDeque;

    .line 117
    .line 118
    invoke-virtual {p0, v3}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    iget-object p0, v1, Lrq2;->C:La9;

    .line 122
    .line 123
    invoke-virtual {p0, v0}, La9;->d0(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_7
    iget-object p0, v1, Lrq2;->w:Ldq2;

    .line 128
    .line 129
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    const-string p0, "Starting activity with a requestCode requires a FragmentActivity host"

    .line 136
    .line 137
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_8
    const-string v0, "Fragment "

    .line 142
    .line 143
    const-string v1, " not attached to Activity"

    .line 144
    .line 145
    invoke-static {p0, v1, v0}, Lrf2;->h(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    :goto_3
    return-void
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

.method public final V(ILjava/lang/CharSequence;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Ly80;->W(ILjava/lang/CharSequence;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ly80;->Q()V

    .line 5
    .line 6
    .line 7
    return-void
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
.end method

.method public final W(ILjava/lang/CharSequence;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ly80;->t0:Lf90;

    .line 2
    .line 3
    iget-boolean v1, v0, Lf90;->l:Z

    .line 4
    .line 5
    const-string v2, "BiometricFragment"

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const-string p0, "Error not sent to client. User is confirming their device credential."

    .line 10
    .line 11
    invoke-static {v2, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-boolean v1, v0, Lf90;->k:Z

    .line 16
    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    const-string p0, "Error not sent to client. Client is not awaiting a result."

    .line 20
    .line 21
    invoke-static {v2, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    const/4 v1, 0x0

    .line 26
    iput-boolean v1, v0, Lf90;->k:Z

    .line 27
    .line 28
    iget-object v0, v0, Lf90;->b:Ljava/util/concurrent/Executor;

    .line 29
    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    new-instance v0, Lw80;

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    invoke-direct {v0, v1}, Lw80;-><init>(I)V

    .line 37
    .line 38
    .line 39
    :goto_0
    new-instance v1, Lq80;

    .line 40
    .line 41
    invoke-direct {v1, p0, p1, p2}, Lq80;-><init>(Ly80;ILjava/lang/CharSequence;)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final X(Lb90;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ly80;->t0:Lf90;

    .line 2
    .line 3
    iget-boolean v1, v0, Lf90;->k:Z

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    const-string p1, "BiometricFragment"

    .line 8
    .line 9
    const-string v0, "Success not sent to client. Client is not awaiting a result."

    .line 10
    .line 11
    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    const/4 v1, 0x0

    .line 16
    iput-boolean v1, v0, Lf90;->k:Z

    .line 17
    .line 18
    iget-object v0, v0, Lf90;->b:Ljava/util/concurrent/Executor;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    new-instance v0, Lw80;

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    invoke-direct {v0, v1}, Lw80;-><init>(I)V

    .line 27
    .line 28
    .line 29
    :goto_0
    new-instance v1, Lga;

    .line 30
    .line 31
    const/4 v2, 0x5

    .line 32
    invoke-direct {v1, v2, p0, p1}, Lga;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 36
    .line 37
    .line 38
    :goto_1
    invoke-virtual {p0}, Ly80;->Q()V

    .line 39
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
.end method

.method public final Y(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    const p1, 0x7f1100d3

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lbq2;->q(I)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    :goto_0
    iget-object v0, p0, Ly80;->t0:Lf90;

    .line 12
    .line 13
    iget-object v1, v0, Lf90;->w:Lbp4;

    .line 14
    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    new-instance v1, Lbp4;

    .line 18
    .line 19
    invoke-direct {v1}, Lbp4;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v1, v0, Lf90;->w:Lbp4;

    .line 23
    .line 24
    :cond_1
    iget-object v0, v0, Lf90;->w:Lbp4;

    .line 25
    .line 26
    const/4 v1, 0x2

    .line 27
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v0, v1}, Lf90;->h(Lbp4;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object p0, p0, Ly80;->t0:Lf90;

    .line 35
    .line 36
    iget-object v0, p0, Lf90;->x:Lbp4;

    .line 37
    .line 38
    if-nez v0, :cond_2

    .line 39
    .line 40
    new-instance v0, Lbp4;

    .line 41
    .line 42
    invoke-direct {v0}, Lbp4;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, Lf90;->x:Lbp4;

    .line 46
    .line 47
    :cond_2
    iget-object p0, p0, Lf90;->x:Lbp4;

    .line 48
    .line 49
    invoke-static {p0, p1}, Lf90;->h(Lbp4;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    return-void
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
.end method

.method public final Z()V
    .locals 13

    .line 1
    iget-object v0, p0, Ly80;->t0:Lf90;

    .line 2
    .line 3
    iget-boolean v0, v0, Lf90;->j:Z

    .line 4
    .line 5
    if-nez v0, :cond_19

    .line 6
    .line 7
    invoke-virtual {p0}, Lbq2;->n()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "BiometricFragment"

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const-string p0, "Not showing biometric prompt. Context is null."

    .line 16
    .line 17
    invoke-static {v1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    iget-object v0, p0, Ly80;->t0:Lf90;

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    iput-boolean v2, v0, Lf90;->j:Z

    .line 25
    .line 26
    iput-boolean v2, v0, Lf90;->k:Z

    .line 27
    .line 28
    invoke-virtual {p0}, Lbq2;->n()Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const/4 v3, 0x0

    .line 33
    const/16 v4, 0x1d

    .line 34
    .line 35
    if-eqz v0, :cond_5

    .line 36
    .line 37
    sget-object v5, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 38
    .line 39
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 40
    .line 41
    if-eq v6, v4, :cond_1

    .line 42
    .line 43
    move v0, v3

    .line 44
    goto :goto_3

    .line 45
    :cond_1
    if-nez v5, :cond_2

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    const v6, 0x7f030005

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v6}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    array-length v6, v0

    .line 60
    move v7, v3

    .line 61
    :goto_0
    if-ge v7, v6, :cond_4

    .line 62
    .line 63
    aget-object v8, v0, v7

    .line 64
    .line 65
    invoke-virtual {v5, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 66
    .line 67
    .line 68
    move-result v8

    .line 69
    if-eqz v8, :cond_3

    .line 70
    .line 71
    move v0, v2

    .line 72
    goto :goto_2

    .line 73
    :cond_3
    add-int/lit8 v7, v7, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_4
    :goto_1
    move v0, v3

    .line 77
    :goto_2
    xor-int/2addr v0, v2

    .line 78
    :goto_3
    if-eqz v0, :cond_5

    .line 79
    .line 80
    iget-object v0, p0, Ly80;->t0:Lf90;

    .line 81
    .line 82
    invoke-virtual {v0}, Lf90;->e()I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    and-int/lit16 v5, v0, 0xff

    .line 87
    .line 88
    const/16 v6, 0xff

    .line 89
    .line 90
    if-ne v5, v6, :cond_5

    .line 91
    .line 92
    invoke-static {v0}, Luq3;->A(I)Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-eqz v0, :cond_5

    .line 97
    .line 98
    iget-object v0, p0, Ly80;->t0:Lf90;

    .line 99
    .line 100
    iput-boolean v2, v0, Lf90;->o:Z

    .line 101
    .line 102
    invoke-virtual {p0}, Ly80;->U()V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :cond_5
    invoke-virtual {p0}, Ly80;->T()Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-eqz v0, :cond_6

    .line 111
    .line 112
    invoke-virtual {p0}, Lbq2;->L()Landroid/content/Context;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    const/16 v1, 0xc

    .line 121
    .line 122
    invoke-static {v0, v1}, Lgw8;->w(Landroid/content/Context;I)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {p0, v1, v0}, Ly80;->V(ILjava/lang/CharSequence;)V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :cond_6
    invoke-virtual {p0}, Lbq2;->L()Landroid/content/Context;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-static {v0}, Lt80;->d(Landroid/content/Context;)Landroid/hardware/biometrics/BiometricPrompt$Builder;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    iget-object v5, p0, Ly80;->t0:Lf90;

    .line 143
    .line 144
    iget-object v5, v5, Lf90;->d:Lqc3;

    .line 145
    .line 146
    const/4 v6, 0x0

    .line 147
    if-eqz v5, :cond_7

    .line 148
    .line 149
    iget-object v7, v5, Lqc3;->x:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v7, Ljava/lang/CharSequence;

    .line 152
    .line 153
    goto :goto_4

    .line 154
    :cond_7
    move-object v7, v6

    .line 155
    :goto_4
    if-eqz v5, :cond_8

    .line 156
    .line 157
    iget-object v5, v5, Lqc3;->y:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v5, Ljava/lang/CharSequence;

    .line 160
    .line 161
    goto :goto_5

    .line 162
    :cond_8
    move-object v5, v6

    .line 163
    :goto_5
    if-eqz v7, :cond_9

    .line 164
    .line 165
    invoke-static {v0, v7}, Lt80;->g(Landroid/hardware/biometrics/BiometricPrompt$Builder;Ljava/lang/CharSequence;)V

    .line 166
    .line 167
    .line 168
    :cond_9
    if-eqz v5, :cond_a

    .line 169
    .line 170
    invoke-static {v0, v5}, Lt80;->f(Landroid/hardware/biometrics/BiometricPrompt$Builder;Ljava/lang/CharSequence;)V

    .line 171
    .line 172
    .line 173
    :cond_a
    iget-object v5, p0, Ly80;->t0:Lf90;

    .line 174
    .line 175
    iget-object v7, v5, Lf90;->h:Ljava/lang/String;

    .line 176
    .line 177
    const-string v8, ""

    .line 178
    .line 179
    if-eqz v7, :cond_b

    .line 180
    .line 181
    goto :goto_6

    .line 182
    :cond_b
    iget-object v5, v5, Lf90;->d:Lqc3;

    .line 183
    .line 184
    if-eqz v5, :cond_c

    .line 185
    .line 186
    move-object v7, v8

    .line 187
    goto :goto_6

    .line 188
    :cond_c
    move-object v7, v6

    .line 189
    :goto_6
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 190
    .line 191
    .line 192
    move-result v5

    .line 193
    if-nez v5, :cond_f

    .line 194
    .line 195
    iget-object v5, p0, Ly80;->t0:Lf90;

    .line 196
    .line 197
    iget-object v5, v5, Lf90;->b:Ljava/util/concurrent/Executor;

    .line 198
    .line 199
    if-eqz v5, :cond_d

    .line 200
    .line 201
    goto :goto_7

    .line 202
    :cond_d
    new-instance v5, Lw80;

    .line 203
    .line 204
    invoke-direct {v5, v2}, Lw80;-><init>(I)V

    .line 205
    .line 206
    .line 207
    :goto_7
    iget-object v9, p0, Ly80;->t0:Lf90;

    .line 208
    .line 209
    iget-object v10, v9, Lf90;->g:Le90;

    .line 210
    .line 211
    if-nez v10, :cond_e

    .line 212
    .line 213
    new-instance v10, Le90;

    .line 214
    .line 215
    invoke-direct {v10, v9}, Le90;-><init>(Lf90;)V

    .line 216
    .line 217
    .line 218
    iput-object v10, v9, Lf90;->g:Le90;

    .line 219
    .line 220
    :cond_e
    iget-object v9, v9, Lf90;->g:Le90;

    .line 221
    .line 222
    invoke-static {v0, v7, v5, v9}, Lt80;->e(Landroid/hardware/biometrics/BiometricPrompt$Builder;Ljava/lang/CharSequence;Ljava/util/concurrent/Executor;Landroid/content/DialogInterface$OnClickListener;)V

    .line 223
    .line 224
    .line 225
    :cond_f
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 226
    .line 227
    if-lt v5, v4, :cond_10

    .line 228
    .line 229
    iget-object v7, p0, Ly80;->t0:Lf90;

    .line 230
    .line 231
    iget-object v7, v7, Lf90;->d:Lqc3;

    .line 232
    .line 233
    invoke-static {v0, v2}, Lu80;->a(Landroid/hardware/biometrics/BiometricPrompt$Builder;Z)V

    .line 234
    .line 235
    .line 236
    :cond_10
    iget-object v7, p0, Ly80;->t0:Lf90;

    .line 237
    .line 238
    invoke-virtual {v7}, Lf90;->e()I

    .line 239
    .line 240
    .line 241
    move-result v7

    .line 242
    const/16 v9, 0x1e

    .line 243
    .line 244
    if-lt v5, v9, :cond_11

    .line 245
    .line 246
    invoke-static {v0, v7}, Lv80;->a(Landroid/hardware/biometrics/BiometricPrompt$Builder;I)V

    .line 247
    .line 248
    .line 249
    goto :goto_8

    .line 250
    :cond_11
    if-lt v5, v4, :cond_12

    .line 251
    .line 252
    invoke-static {v7}, Luq3;->A(I)Z

    .line 253
    .line 254
    .line 255
    move-result v4

    .line 256
    invoke-static {v0, v4}, Lu80;->b(Landroid/hardware/biometrics/BiometricPrompt$Builder;Z)V

    .line 257
    .line 258
    .line 259
    :cond_12
    :goto_8
    invoke-static {v0}, Lt80;->c(Landroid/hardware/biometrics/BiometricPrompt$Builder;)Landroid/hardware/biometrics/BiometricPrompt;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-virtual {p0}, Lbq2;->n()Landroid/content/Context;

    .line 264
    .line 265
    .line 266
    move-result-object v4

    .line 267
    iget-object v5, p0, Ly80;->t0:Lf90;

    .line 268
    .line 269
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    invoke-static {v6}, Lrj1;->N(Led1;)Landroid/hardware/biometrics/BiometricPrompt$CryptoObject;

    .line 273
    .line 274
    .line 275
    move-result-object v5

    .line 276
    iget-object v6, p0, Ly80;->t0:Lf90;

    .line 277
    .line 278
    iget-object v7, v6, Lf90;->f:Lf96;

    .line 279
    .line 280
    if-nez v7, :cond_13

    .line 281
    .line 282
    new-instance v7, Lf96;

    .line 283
    .line 284
    const/16 v9, 0x9

    .line 285
    .line 286
    invoke-direct {v7, v9, v3}, Lf96;-><init>(IZ)V

    .line 287
    .line 288
    .line 289
    iput-object v7, v6, Lf90;->f:Lf96;

    .line 290
    .line 291
    :cond_13
    iget-object v6, v6, Lf90;->f:Lf96;

    .line 292
    .line 293
    iget-object v7, v6, Lf96;->x:Ljava/lang/Object;

    .line 294
    .line 295
    check-cast v7, Landroid/os/CancellationSignal;

    .line 296
    .line 297
    if-nez v7, :cond_14

    .line 298
    .line 299
    invoke-static {}, Lnk0;->b()Landroid/os/CancellationSignal;

    .line 300
    .line 301
    .line 302
    move-result-object v7

    .line 303
    iput-object v7, v6, Lf96;->x:Ljava/lang/Object;

    .line 304
    .line 305
    :cond_14
    iget-object v6, v6, Lf96;->x:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v6, Landroid/os/CancellationSignal;

    .line 308
    .line 309
    new-instance v7, Lw80;

    .line 310
    .line 311
    invoke-direct {v7, v3}, Lw80;-><init>(I)V

    .line 312
    .line 313
    .line 314
    iget-object v9, p0, Ly80;->t0:Lf90;

    .line 315
    .line 316
    iget-object v10, v9, Lf90;->e:Lqc3;

    .line 317
    .line 318
    if-nez v10, :cond_15

    .line 319
    .line 320
    new-instance v10, Lqc3;

    .line 321
    .line 322
    new-instance v11, Ld90;

    .line 323
    .line 324
    invoke-direct {v11, v9}, Ld90;-><init>(Lf90;)V

    .line 325
    .line 326
    .line 327
    const/16 v12, 0x10

    .line 328
    .line 329
    invoke-direct {v10, v12, v11, v3}, Lqc3;-><init>(ILjava/lang/Object;Z)V

    .line 330
    .line 331
    .line 332
    iput-object v10, v9, Lf90;->e:Lqc3;

    .line 333
    .line 334
    :cond_15
    iget-object v3, v9, Lf90;->e:Lqc3;

    .line 335
    .line 336
    iget-object v9, v3, Lqc3;->x:Ljava/lang/Object;

    .line 337
    .line 338
    check-cast v9, Landroid/hardware/biometrics/BiometricPrompt$AuthenticationCallback;

    .line 339
    .line 340
    if-nez v9, :cond_16

    .line 341
    .line 342
    iget-object v9, v3, Lqc3;->y:Ljava/lang/Object;

    .line 343
    .line 344
    check-cast v9, Ld90;

    .line 345
    .line 346
    invoke-static {v9}, Lcw;->a(Lew;)Landroid/hardware/biometrics/BiometricPrompt$AuthenticationCallback;

    .line 347
    .line 348
    .line 349
    move-result-object v9

    .line 350
    iput-object v9, v3, Lqc3;->x:Ljava/lang/Object;

    .line 351
    .line 352
    :cond_16
    iget-object v3, v3, Lqc3;->x:Ljava/lang/Object;

    .line 353
    .line 354
    check-cast v3, Landroid/hardware/biometrics/BiometricPrompt$AuthenticationCallback;

    .line 355
    .line 356
    if-nez v5, :cond_17

    .line 357
    .line 358
    :try_start_0
    invoke-static {v0, v6, v7, v3}, Lt80;->b(Landroid/hardware/biometrics/BiometricPrompt;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroid/hardware/biometrics/BiometricPrompt$AuthenticationCallback;)V

    .line 359
    .line 360
    .line 361
    return-void

    .line 362
    :catch_0
    move-exception v0

    .line 363
    goto :goto_9

    .line 364
    :cond_17
    invoke-static {v0, v5, v6, v7, v3}, Lt80;->a(Landroid/hardware/biometrics/BiometricPrompt;Landroid/hardware/biometrics/BiometricPrompt$CryptoObject;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroid/hardware/biometrics/BiometricPrompt$AuthenticationCallback;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 365
    .line 366
    .line 367
    return-void

    .line 368
    :goto_9
    const-string v3, "Got NPE while authenticating with biometric prompt."

    .line 369
    .line 370
    invoke-static {v1, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 371
    .line 372
    .line 373
    if-eqz v4, :cond_18

    .line 374
    .line 375
    const v0, 0x7f1100d3

    .line 376
    .line 377
    .line 378
    invoke-virtual {v4, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v8

    .line 382
    :cond_18
    invoke-virtual {p0, v2, v8}, Ly80;->V(ILjava/lang/CharSequence;)V

    .line 383
    .line 384
    .line 385
    :cond_19
    return-void
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
.end method

.method public final x(IILandroid/content/Intent;)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Lbq2;->x(IILandroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    const/4 p3, 0x1

    .line 5
    if-ne p1, p3, :cond_2

    .line 6
    .line 7
    iget-object p1, p0, Ly80;->t0:Lf90;

    .line 8
    .line 9
    const/4 p3, 0x0

    .line 10
    iput-boolean p3, p1, Lf90;->l:Z

    .line 11
    .line 12
    const/4 v0, -0x1

    .line 13
    if-ne p2, v0, :cond_1

    .line 14
    .line 15
    iget-boolean p2, p1, Lf90;->o:Z

    .line 16
    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    iput-boolean p3, p1, Lf90;->o:Z

    .line 20
    .line 21
    :cond_0
    new-instance p1, Lb90;

    .line 22
    .line 23
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ly80;->X(Lb90;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    const p1, 0x7f110155

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p1}, Lbq2;->q(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    const/16 p2, 0xa

    .line 38
    .line 39
    invoke-virtual {p0, p2, p1}, Ly80;->V(ILjava/lang/CharSequence;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    return-void
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

.method public final z(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Lbq2;->z(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Ly80;->t0:Lf90;

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lbq2;->B:Landroid/os/Bundle;

    .line 10
    .line 11
    const-string v1, "host_activity"

    .line 12
    .line 13
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-static {p0, p1}, Lfd1;->N(Lbq2;Z)Lf90;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Ly80;->t0:Lf90;

    .line 22
    .line 23
    :cond_0
    iget-object p1, p0, Ly80;->t0:Lf90;

    .line 24
    .line 25
    invoke-virtual {p0}, Lbq2;->l()Leq2;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 33
    .line 34
    invoke-direct {p1, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Ly80;->t0:Lf90;

    .line 38
    .line 39
    iget-object v1, p1, Lf90;->p:Lbp4;

    .line 40
    .line 41
    if-nez v1, :cond_1

    .line 42
    .line 43
    new-instance v1, Lbp4;

    .line 44
    .line 45
    invoke-direct {v1}, Lbp4;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object v1, p1, Lf90;->p:Lbp4;

    .line 49
    .line 50
    :cond_1
    iget-object p1, p1, Lf90;->p:Lbp4;

    .line 51
    .line 52
    new-instance v1, Lp80;

    .line 53
    .line 54
    const/4 v2, 0x0

    .line 55
    invoke-direct {v1, p0, v2}, Lp80;-><init>(Ly80;I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, p0, v1}, Lbp4;->d(Lt54;Lg35;)V

    .line 59
    .line 60
    .line 61
    iget-object p1, p0, Ly80;->t0:Lf90;

    .line 62
    .line 63
    iget-object v1, p1, Lf90;->q:Lbp4;

    .line 64
    .line 65
    if-nez v1, :cond_2

    .line 66
    .line 67
    new-instance v1, Lbp4;

    .line 68
    .line 69
    invoke-direct {v1}, Lbp4;-><init>()V

    .line 70
    .line 71
    .line 72
    iput-object v1, p1, Lf90;->q:Lbp4;

    .line 73
    .line 74
    :cond_2
    iget-object p1, p1, Lf90;->q:Lbp4;

    .line 75
    .line 76
    new-instance v1, Lp80;

    .line 77
    .line 78
    invoke-direct {v1, p0, v0}, Lp80;-><init>(Ly80;I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, p0, v1}, Lbp4;->d(Lt54;Lg35;)V

    .line 82
    .line 83
    .line 84
    iget-object p1, p0, Ly80;->t0:Lf90;

    .line 85
    .line 86
    iget-object v0, p1, Lf90;->r:Lbp4;

    .line 87
    .line 88
    if-nez v0, :cond_3

    .line 89
    .line 90
    new-instance v0, Lbp4;

    .line 91
    .line 92
    invoke-direct {v0}, Lbp4;-><init>()V

    .line 93
    .line 94
    .line 95
    iput-object v0, p1, Lf90;->r:Lbp4;

    .line 96
    .line 97
    :cond_3
    iget-object p1, p1, Lf90;->r:Lbp4;

    .line 98
    .line 99
    new-instance v0, Lp80;

    .line 100
    .line 101
    const/4 v1, 0x2

    .line 102
    invoke-direct {v0, p0, v1}, Lp80;-><init>(Ly80;I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1, p0, v0}, Lbp4;->d(Lt54;Lg35;)V

    .line 106
    .line 107
    .line 108
    iget-object p1, p0, Ly80;->t0:Lf90;

    .line 109
    .line 110
    iget-object v0, p1, Lf90;->s:Lbp4;

    .line 111
    .line 112
    if-nez v0, :cond_4

    .line 113
    .line 114
    new-instance v0, Lbp4;

    .line 115
    .line 116
    invoke-direct {v0}, Lbp4;-><init>()V

    .line 117
    .line 118
    .line 119
    iput-object v0, p1, Lf90;->s:Lbp4;

    .line 120
    .line 121
    :cond_4
    iget-object p1, p1, Lf90;->s:Lbp4;

    .line 122
    .line 123
    new-instance v0, Lp80;

    .line 124
    .line 125
    const/4 v1, 0x3

    .line 126
    invoke-direct {v0, p0, v1}, Lp80;-><init>(Ly80;I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1, p0, v0}, Lbp4;->d(Lt54;Lg35;)V

    .line 130
    .line 131
    .line 132
    iget-object p1, p0, Ly80;->t0:Lf90;

    .line 133
    .line 134
    iget-object v0, p1, Lf90;->t:Lbp4;

    .line 135
    .line 136
    if-nez v0, :cond_5

    .line 137
    .line 138
    new-instance v0, Lbp4;

    .line 139
    .line 140
    invoke-direct {v0}, Lbp4;-><init>()V

    .line 141
    .line 142
    .line 143
    iput-object v0, p1, Lf90;->t:Lbp4;

    .line 144
    .line 145
    :cond_5
    iget-object p1, p1, Lf90;->t:Lbp4;

    .line 146
    .line 147
    new-instance v0, Lp80;

    .line 148
    .line 149
    const/4 v1, 0x4

    .line 150
    invoke-direct {v0, p0, v1}, Lp80;-><init>(Ly80;I)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1, p0, v0}, Lbp4;->d(Lt54;Lg35;)V

    .line 154
    .line 155
    .line 156
    iget-object p1, p0, Ly80;->t0:Lf90;

    .line 157
    .line 158
    iget-object v0, p1, Lf90;->v:Lbp4;

    .line 159
    .line 160
    if-nez v0, :cond_6

    .line 161
    .line 162
    new-instance v0, Lbp4;

    .line 163
    .line 164
    invoke-direct {v0}, Lbp4;-><init>()V

    .line 165
    .line 166
    .line 167
    iput-object v0, p1, Lf90;->v:Lbp4;

    .line 168
    .line 169
    :cond_6
    iget-object p1, p1, Lf90;->v:Lbp4;

    .line 170
    .line 171
    new-instance v0, Lp80;

    .line 172
    .line 173
    const/4 v1, 0x5

    .line 174
    invoke-direct {v0, p0, v1}, Lp80;-><init>(Ly80;I)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {p1, p0, v0}, Lbp4;->d(Lt54;Lg35;)V

    .line 178
    .line 179
    .line 180
    return-void
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
.end method
