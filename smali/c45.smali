.class public final Lc45;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public A:I

.field public B:J

.field public C:Lbr4;

.field public D:Lbc7;

.field public a:Lam6;

.field public b:Lji8;

.field public final c:Ljava/util/ArrayList;

.field public final d:Ljava/util/ArrayList;

.field public e:Lkj6;

.field public f:Z

.field public g:Z

.field public h:Lg22;

.field public i:Z

.field public j:Z

.field public k:Ls61;

.field public l:Lyw1;

.field public m:Ljava/net/ProxySelector;

.field public n:Lg22;

.field public o:Ljavax/net/SocketFactory;

.field public p:Ljavax/net/ssl/SSLSocketFactory;

.field public q:Ljavax/net/ssl/X509TrustManager;

.field public r:Ljava/util/List;

.field public s:Ljava/util/List;

.field public t:Ljavax/net/ssl/HostnameVerifier;

.field public u:Lsm0;

.field public v:Lx91;

.field public w:I

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lam6;

    .line 5
    .line 6
    const/16 v1, 0xb

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lam6;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lc45;->a:Lam6;

    .line 12
    .line 13
    new-instance v0, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lc45;->c:Ljava/util/ArrayList;

    .line 19
    .line 20
    new-instance v0, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lc45;->d:Ljava/util/ArrayList;

    .line 26
    .line 27
    sget-object v0, Lfg8;->a:Ljava/util/TimeZone;

    .line 28
    .line 29
    new-instance v0, Lkj6;

    .line 30
    .line 31
    const/16 v1, 0x1b

    .line 32
    .line 33
    invoke-direct {v0, v1}, Lkj6;-><init>(I)V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, Lc45;->e:Lkj6;

    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    iput-boolean v0, p0, Lc45;->f:Z

    .line 40
    .line 41
    iput-boolean v0, p0, Lc45;->g:Z

    .line 42
    .line 43
    sget-object v1, Lg22;->y:Lg22;

    .line 44
    .line 45
    iput-object v1, p0, Lc45;->h:Lg22;

    .line 46
    .line 47
    iput-boolean v0, p0, Lc45;->i:Z

    .line 48
    .line 49
    iput-boolean v0, p0, Lc45;->j:Z

    .line 50
    .line 51
    sget-object v0, Ls61;->f:Ltd0;

    .line 52
    .line 53
    iput-object v0, p0, Lc45;->k:Ls61;

    .line 54
    .line 55
    sget-object v0, Lyw1;->g:Ld63;

    .line 56
    .line 57
    iput-object v0, p0, Lc45;->l:Lyw1;

    .line 58
    .line 59
    iput-object v1, p0, Lc45;->n:Lg22;

    .line 60
    .line 61
    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    iput-object v0, p0, Lc45;->o:Ljavax/net/SocketFactory;

    .line 69
    .line 70
    sget-object v0, Ld45;->F:Ljava/util/List;

    .line 71
    .line 72
    iput-object v0, p0, Lc45;->r:Ljava/util/List;

    .line 73
    .line 74
    sget-object v0, Ld45;->E:Ljava/util/List;

    .line 75
    .line 76
    iput-object v0, p0, Lc45;->s:Ljava/util/List;

    .line 77
    .line 78
    sget-object v0, La45;->a:La45;

    .line 79
    .line 80
    iput-object v0, p0, Lc45;->t:Ljavax/net/ssl/HostnameVerifier;

    .line 81
    .line 82
    sget-object v0, Lsm0;->c:Lsm0;

    .line 83
    .line 84
    iput-object v0, p0, Lc45;->u:Lsm0;

    .line 85
    .line 86
    const/16 v0, 0x2710

    .line 87
    .line 88
    iput v0, p0, Lc45;->x:I

    .line 89
    .line 90
    iput v0, p0, Lc45;->y:I

    .line 91
    .line 92
    iput v0, p0, Lc45;->z:I

    .line 93
    .line 94
    const v0, 0xea60

    .line 95
    .line 96
    .line 97
    iput v0, p0, Lc45;->A:I

    .line 98
    .line 99
    const-wide/16 v0, 0x400

    .line 100
    .line 101
    iput-wide v0, p0, Lc45;->B:J

    .line 102
    .line 103
    return-void
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


# virtual methods
.method public final a(JLjava/util/concurrent/TimeUnit;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1, p2, p3}, Lfg8;->b(JLjava/util/concurrent/TimeUnit;)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    iput p1, p0, Lc45;->x:I

    .line 9
    .line 10
    return-void
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

.method public final b(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc45;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lc45;->q:Ljavax/net/ssl/X509TrustManager;

    .line 10
    .line 11
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Lc45;->C:Lbr4;

    .line 19
    .line 20
    :cond_1
    iput-object p1, p0, Lc45;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 21
    .line 22
    sget-object p1, Lej5;->a:Lej5;

    .line 23
    .line 24
    sget-object p1, Lej5;->a:Lej5;

    .line 25
    .line 26
    invoke-virtual {p1, p2}, Lej5;->c(Ljavax/net/ssl/X509TrustManager;)Lx91;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, Lc45;->v:Lx91;

    .line 31
    .line 32
    iput-object p2, p0, Lc45;->q:Ljavax/net/ssl/X509TrustManager;

    .line 33
    .line 34
    return-void
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
