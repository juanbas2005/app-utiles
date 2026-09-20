.class public final Ltr8;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lfh7;


# static fields
.field public static final y:Lz53;


# instance fields
.field public final w:Luy5;

.field public final x:Lts2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lz53;

    .line 2
    .line 3
    const/16 v1, 0x11

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lz53;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Ltr8;->y:Lz53;

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
.end method

.method public constructor <init>(Lts2;Z)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ltr8;->x:Lts2;

    .line 5
    .line 6
    new-instance p1, Luy5;

    .line 7
    .line 8
    const/16 v0, 0xf

    .line 9
    .line 10
    invoke-direct {p1, v0}, Luy5;-><init>(I)V

    .line 11
    .line 12
    .line 13
    if-eqz p2, :cond_2

    .line 14
    .line 15
    sget-object p2, Lsp8;->e:Lcj;

    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    check-cast p2, Lvq8;

    .line 22
    .line 23
    iget-object v0, p2, Lvq8;->b:Lcq8;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    sget p2, Leq8;->a:I

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    sget v0, Lcq8;->x:I

    .line 31
    .line 32
    sget-object v0, Lwp8;->c:Lwp8;

    .line 33
    .line 34
    invoke-virtual {v0}, Lwp8;->a()J

    .line 35
    .line 36
    .line 37
    move-result-wide v1

    .line 38
    const-wide/32 v3, -0xf001

    .line 39
    .line 40
    .line 41
    and-long/2addr v1, v3

    .line 42
    invoke-virtual {v0}, Lwp8;->a()J

    .line 43
    .line 44
    .line 45
    move-result-wide v3

    .line 46
    const/4 v5, 0x2

    .line 47
    ushr-long/2addr v3, v5

    .line 48
    iget-object v0, v0, Lwp8;->a:Ljava/util/UUID;

    .line 49
    .line 50
    new-instance v5, Ljava/util/UUID;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/util/UUID;->getMostSignificantBits()J

    .line 53
    .line 54
    .line 55
    move-result-wide v6

    .line 56
    xor-long/2addr v1, v6

    .line 57
    invoke-virtual {v0}, Ljava/util/UUID;->getLeastSignificantBits()J

    .line 58
    .line 59
    .line 60
    move-result-wide v6

    .line 61
    xor-long/2addr v3, v6

    .line 62
    invoke-direct {v5, v1, v2, v3, v4}, Ljava/util/UUID;-><init>(JJ)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v5}, Ljava/util/UUID;->getLeastSignificantBits()J

    .line 66
    .line 67
    .line 68
    move-result-wide v0

    .line 69
    const/4 v2, 0x1

    .line 70
    ushr-long/2addr v0, v2

    .line 71
    const/16 v2, 0x24

    .line 72
    .line 73
    invoke-static {v0, v1, v2}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    const-string v1, "tk-trace-id: "

    .line 82
    .line 83
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    sget-object v1, Lsp8;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    check-cast v1, Los8;

    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-nez v2, :cond_1

    .line 100
    .line 101
    new-instance v2, Lzp8;

    .line 102
    .line 103
    const/4 v3, 0x0

    .line 104
    invoke-direct {v2, v3}, Lzp8;-><init>(I)V

    .line 105
    .line 106
    .line 107
    invoke-interface {v1, v2}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 108
    .line 109
    .line 110
    :cond_1
    new-instance v1, Lcq8;

    .line 111
    .line 112
    invoke-direct {v1, v0, p2}, Lcq8;-><init>(Ljava/lang/String;Lvq8;)V

    .line 113
    .line 114
    .line 115
    move-object v0, v1

    .line 116
    goto :goto_0

    .line 117
    :cond_2
    const/4 v0, 0x0

    .line 118
    :goto_0
    iput-object v0, p1, Luy5;->x:Ljava/lang/Object;

    .line 119
    .line 120
    iput-object p1, p0, Ltr8;->w:Luy5;

    .line 121
    .line 122
    return-void
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
.end method


# virtual methods
.method public final G(Lgs2;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p1, p2, p0}, Lgs2;->H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
    .line 6
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

.method public final L(Ld81;)Le81;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lrc9;->A0(Lc81;Ld81;)Le81;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
    .line 6
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

.method public final X(Le81;)Le81;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lrc9;->D0(Lc81;Le81;)Le81;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
    .line 6
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

.method public final a0(Ld81;)Lc81;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lrc9;->J(Lc81;Ld81;)Lc81;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
    .line 6
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

.method public final b0(Le81;Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p2, Lnr8;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    sget-object p0, Lsp8;->e:Lcj;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lvq8;

    .line 16
    .line 17
    iget-object p1, p2, Lnr8;->a:Lcq8;

    .line 18
    .line 19
    const/4 v0, 0x3

    .line 20
    invoke-static {p0, p1, v0}, Lsp8;->a(Lvq8;Lcq8;I)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p2, Lnr8;->b:Luy5;

    .line 24
    .line 25
    iput-object p1, p0, Lvq8;->d:Luy5;

    .line 26
    .line 27
    iget-object p1, p2, Lnr8;->c:Lcq8;

    .line 28
    .line 29
    iput-object p1, p0, Lvq8;->c:Lcq8;

    .line 30
    .line 31
    return-void
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

.method public final getKey()Ld81;
    .locals 0

    .line 1
    sget-object p0, Ltr8;->y:Lz53;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
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

.method public final h0(Le81;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p1, Lsp8;->e:Lcj;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Lvq8;

    .line 11
    .line 12
    iget-object v0, p1, Lvq8;->d:Luy5;

    .line 13
    .line 14
    iget-object v1, p1, Lvq8;->b:Lcq8;

    .line 15
    .line 16
    iget-object v2, p1, Lvq8;->c:Lcq8;

    .line 17
    .line 18
    iget-object p0, p0, Ltr8;->w:Luy5;

    .line 19
    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    move-object v3, v1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v3, p0, Luy5;->x:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v3, Lcq8;

    .line 29
    .line 30
    :goto_0
    iput-object v3, p1, Lvq8;->c:Lcq8;

    .line 31
    .line 32
    :cond_1
    iput-object p0, p1, Lvq8;->d:Luy5;

    .line 33
    .line 34
    iget-object p0, p0, Luy5;->x:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p0, Lcq8;

    .line 37
    .line 38
    const/4 v3, 0x1

    .line 39
    invoke-static {p1, p0, v3}, Lsp8;->a(Lvq8;Lcq8;I)V

    .line 40
    .line 41
    .line 42
    new-instance p0, Lnr8;

    .line 43
    .line 44
    invoke-direct {p0, v1, v0, v2}, Lnr8;-><init>(Lcq8;Luy5;Lcq8;)V

    .line 45
    .line 46
    .line 47
    return-object p0
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
