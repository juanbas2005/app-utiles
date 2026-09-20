.class public final Lyq5;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final d:Lk26;

.field public static final e:Lk26;

.field public static final f:Lk26;

.field public static final g:Lk26;


# instance fields
.field public final a:Lh81;

.field public final b:Lz97;

.field public volatile c:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lk26;

    .line 2
    .line 3
    const-string v1, "mipromocion-contenido-movil\"\\s*>\\s*<img\\s+src=\"([^\"]+)\""

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lk26;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lyq5;->d:Lk26;

    .line 9
    .line 10
    new-instance v0, Lk26;

    .line 11
    .line 12
    const-string v1, "mipromocion-contenido\"\\s*>\\s*<img\\s+src=\"([^\"]+)\""

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lk26;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lyq5;->e:Lk26;

    .line 18
    .line 19
    new-instance v0, Lk26;

    .line 20
    .line 21
    const-string v1, "href=\"([^\"]+)\"[^>]*class=\"btn comprar-mv\""

    .line 22
    .line 23
    invoke-direct {v0, v1}, Lk26;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lyq5;->f:Lk26;

    .line 27
    .line 28
    new-instance v0, Lk26;

    .line 29
    .line 30
    const-string v1, "/sites/default/files/promocion/[^\"\'()<>\\s]+\\.svg"

    .line 31
    .line 32
    invoke-direct {v0, v1}, Lk26;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lyq5;->g:Lk26;

    .line 36
    .line 37
    return-void
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

.method public constructor <init>(Lh81;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyq5;->a:Lh81;

    .line 5
    .line 6
    new-instance p1, Lpp5;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-direct {p1, v0}, Lpp5;-><init>(I)V

    .line 10
    .line 11
    .line 12
    new-instance v0, Lz97;

    .line 13
    .line 14
    invoke-direct {v0, p1}, Lz97;-><init>(Lsr2;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lyq5;->b:Lz97;

    .line 18
    .line 19
    return-void
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

.method public static final a(Lyq5;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string p0, "http"

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-static {p1, p0, v0}, Lk57;->u0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    return-object p1

    .line 11
    :cond_0
    const/4 p0, 0x1

    .line 12
    new-array p0, p0, [C

    .line 13
    .line 14
    const/16 v1, 0x2f

    .line 15
    .line 16
    aput-char v1, p0, v0

    .line 17
    .line 18
    const-string v0, "https://www.etecsa.cu/"

    .line 19
    .line 20
    invoke-static {v0, p0}, Ld57;->l1(Ljava/lang/String;[C)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {p0, p1}, Lb81;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
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
.method public final b(Lh61;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, Lvq5;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lvq5;

    .line 7
    .line 8
    iget v1, v0, Lvq5;->B:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lvq5;->B:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lvq5;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lvq5;-><init>(Lyq5;Lh61;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lvq5;->z:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lp81;->w:Lp81;

    .line 28
    .line 29
    iget v2, v0, Lvq5;->B:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    :try_start_0
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    .line 40
    return-object p1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v3

    .line 47
    :cond_2
    invoke-static {p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :try_start_1
    iget-object p1, p0, Lyq5;->c:Ljava/util/ArrayList;

    .line 51
    .line 52
    if-eqz p1, :cond_3

    .line 53
    .line 54
    return-object p1

    .line 55
    :cond_3
    iget-object p1, p0, Lyq5;->a:Lh81;

    .line 56
    .line 57
    new-instance v2, Lf70;

    .line 58
    .line 59
    const/16 v5, 0xb

    .line 60
    .line 61
    invoke-direct {v2, p0, v3, v5}, Lf70;-><init>(Ljava/lang/Object;Lf61;I)V

    .line 62
    .line 63
    .line 64
    iput v4, v0, Lvq5;->B:I

    .line 65
    .line 66
    invoke-static {p1, v2, v0}, Lar7;->e0(Le81;Lgs2;Lf61;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 70
    if-ne p0, v1, :cond_4

    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_4
    return-object p0

    .line 74
    :catch_0
    move-exception p0

    .line 75
    new-instance p1, Lm66;

    .line 76
    .line 77
    invoke-direct {p1, p0}, Lm66;-><init>(Ljava/lang/Throwable;)V

    .line 78
    .line 79
    .line 80
    return-object p1

    .line 81
    :catch_1
    move-exception p0

    .line 82
    throw p0
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
.end method
