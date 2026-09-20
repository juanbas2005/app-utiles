.class public final synthetic Lvr4;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lsr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lgs4;


# direct methods
.method public synthetic constructor <init>(Lgs4;I)V
    .locals 0

    .line 1
    iput p2, p0, Lvr4;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lvr4;->x:Lgs4;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
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


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lvr4;->w:I

    .line 2
    .line 3
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 4
    .line 5
    iget-object p0, p0, Lvr4;->x:Lgs4;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lgs4;->d()Ld45;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Ld45;->a()Lc45;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-wide/16 v2, 0xf

    .line 19
    .line 20
    invoke-virtual {p0, v2, v3, v1}, Lc45;->a(JLjava/util/concurrent/TimeUnit;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v2, v3, v1}, Lfg8;->b(JLjava/util/concurrent/TimeUnit;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iput v0, p0, Lc45;->y:I

    .line 28
    .line 29
    new-instance v0, Ld45;

    .line 30
    .line 31
    invoke-direct {v0, p0}, Ld45;-><init>(Lc45;)V

    .line 32
    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_0
    new-instance v0, Lyr4;

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    invoke-direct {v0, v2}, Lyr4;-><init>(I)V

    .line 39
    .line 40
    .line 41
    const/4 v3, 0x1

    .line 42
    new-array v4, v3, [Ljavax/net/ssl/TrustManager;

    .line 43
    .line 44
    aput-object v0, v4, v2

    .line 45
    .line 46
    const-string v0, "TLS"

    .line 47
    .line 48
    invoke-static {v0}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    new-instance v5, Ljava/security/SecureRandom;

    .line 53
    .line 54
    invoke-direct {v5}, Ljava/security/SecureRandom;-><init>()V

    .line 55
    .line 56
    .line 57
    const/4 v6, 0x0

    .line 58
    invoke-virtual {v0, v6, v4, v5}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    .line 59
    .line 60
    .line 61
    new-instance v5, Lc45;

    .line 62
    .line 63
    invoke-direct {v5}, Lc45;-><init>()V

    .line 64
    .line 65
    .line 66
    const-wide/16 v7, 0x1e

    .line 67
    .line 68
    invoke-virtual {v5, v7, v8, v1}, Lc45;->a(JLjava/util/concurrent/TimeUnit;)V

    .line 69
    .line 70
    .line 71
    const-wide/16 v9, 0x3c

    .line 72
    .line 73
    invoke-static {v9, v10, v1}, Lfg8;->b(JLjava/util/concurrent/TimeUnit;)I

    .line 74
    .line 75
    .line 76
    move-result v11

    .line 77
    iput v11, v5, Lc45;->y:I

    .line 78
    .line 79
    invoke-static {v7, v8, v1}, Lfg8;->b(JLjava/util/concurrent/TimeUnit;)I

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    iput v7, v5, Lc45;->z:I

    .line 84
    .line 85
    invoke-static {v9, v10, v1}, Lfg8;->b(JLjava/util/concurrent/TimeUnit;)I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    iput v1, v5, Lc45;->w:I

    .line 90
    .line 91
    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    aget-object v1, v4, v2

    .line 99
    .line 100
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    check-cast v1, Ljavax/net/ssl/X509TrustManager;

    .line 104
    .line 105
    invoke-virtual {v5, v0, v1}, Lc45;->b(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)V

    .line 106
    .line 107
    .line 108
    new-instance v0, Lwr4;

    .line 109
    .line 110
    invoke-direct {v0, v2}, Lwr4;-><init>(I)V

    .line 111
    .line 112
    .line 113
    iget-object v1, v5, Lc45;->t:Ljavax/net/ssl/HostnameVerifier;

    .line 114
    .line 115
    if-eq v0, v1, :cond_0

    .line 116
    .line 117
    iput-object v6, v5, Lc45;->C:Lbr4;

    .line 118
    .line 119
    :cond_0
    iput-object v0, v5, Lc45;->t:Ljavax/net/ssl/HostnameVerifier;

    .line 120
    .line 121
    iput-boolean v3, v5, Lc45;->i:Z

    .line 122
    .line 123
    iget-object v0, p0, Lgs4;->f:Lwv2;

    .line 124
    .line 125
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    iput-object v0, v5, Lc45;->k:Ls61;

    .line 129
    .line 130
    new-instance v0, Lul5;

    .line 131
    .line 132
    iget-object p0, p0, Lgs4;->d:Lay4;

    .line 133
    .line 134
    invoke-direct {v0, p0}, Lul5;-><init>(Lay4;)V

    .line 135
    .line 136
    .line 137
    iget-object v1, v5, Lc45;->l:Lyw1;

    .line 138
    .line 139
    if-eq v0, v1, :cond_1

    .line 140
    .line 141
    iput-object v6, v5, Lc45;->C:Lbr4;

    .line 142
    .line 143
    :cond_1
    iput-object v0, v5, Lc45;->l:Lyw1;

    .line 144
    .line 145
    new-instance v0, Lvl5;

    .line 146
    .line 147
    invoke-direct {v0, p0}, Lvl5;-><init>(Lay4;)V

    .line 148
    .line 149
    .line 150
    iget-object p0, v5, Lc45;->o:Ljavax/net/SocketFactory;

    .line 151
    .line 152
    if-eq v0, p0, :cond_2

    .line 153
    .line 154
    iput-object v6, v5, Lc45;->C:Lbr4;

    .line 155
    .line 156
    :cond_2
    iput-object v0, v5, Lc45;->o:Ljavax/net/SocketFactory;

    .line 157
    .line 158
    new-instance p0, Ld45;

    .line 159
    .line 160
    invoke-direct {p0, v5}, Ld45;-><init>(Lc45;)V

    .line 161
    .line 162
    .line 163
    return-object p0

    .line 164
    nop

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method
