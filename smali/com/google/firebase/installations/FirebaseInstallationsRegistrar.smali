.class public Lcom/google/firebase/installations/FirebaseInstallationsRegistrar;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-installations"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
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

.method public static synthetic a(Lkd6;)Lwe2;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/firebase/installations/FirebaseInstallationsRegistrar;->lambda$getComponents$0(Ltv0;)Lwe2;

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

.method private static lambda$getComponents$0(Ltv0;)Lwe2;
    .locals 7

    .line 1
    new-instance v0, Lve2;

    .line 2
    .line 3
    const-class v1, Loe2;

    .line 4
    .line 5
    invoke-interface {p0, v1}, Ltv0;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Loe2;

    .line 10
    .line 11
    const-class v2, Liz2;

    .line 12
    .line 13
    invoke-interface {p0, v2}, Ltv0;->h(Ljava/lang/Class;)Lnu5;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    new-instance v3, Lav5;

    .line 18
    .line 19
    const-class v4, Lt30;

    .line 20
    .line 21
    const-class v5, Ljava/util/concurrent/ExecutorService;

    .line 22
    .line 23
    invoke-direct {v3, v4, v5}, Lav5;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p0, v3}, Ltv0;->s(Lav5;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Ljava/util/concurrent/ExecutorService;

    .line 31
    .line 32
    new-instance v4, Lav5;

    .line 33
    .line 34
    const-class v5, Lx90;

    .line 35
    .line 36
    const-class v6, Ljava/util/concurrent/Executor;

    .line 37
    .line 38
    invoke-direct {v4, v5, v6}, Lav5;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 39
    .line 40
    .line 41
    invoke-interface {p0, v4}, Ltv0;->s(Lav5;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    check-cast p0, Ljava/util/concurrent/Executor;

    .line 46
    .line 47
    new-instance v4, Lil6;

    .line 48
    .line 49
    invoke-direct {v4, p0}, Lil6;-><init>(Ljava/util/concurrent/Executor;)V

    .line 50
    .line 51
    .line 52
    invoke-direct {v0, v1, v2, v3, v4}, Lve2;-><init>(Loe2;Lnu5;Ljava/util/concurrent/ExecutorService;Lil6;)V

    .line 53
    .line 54
    .line 55
    return-object v0
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


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lgv0;",
            ">;"
        }
    .end annotation

    .line 1
    const-class p0, Lwe2;

    .line 2
    .line 3
    invoke-static {p0}, Lgv0;->b(Ljava/lang/Class;)Lfv0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v0, "fire-installations"

    .line 8
    .line 9
    iput-object v0, p0, Lfv0;->a:Ljava/lang/String;

    .line 10
    .line 11
    const-class v1, Loe2;

    .line 12
    .line 13
    invoke-static {v1}, Lzp1;->c(Ljava/lang/Class;)Lzp1;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p0, v1}, Lfv0;->a(Lzp1;)V

    .line 18
    .line 19
    .line 20
    const-class v1, Liz2;

    .line 21
    .line 22
    invoke-static {v1}, Lzp1;->a(Ljava/lang/Class;)Lzp1;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {p0, v1}, Lfv0;->a(Lzp1;)V

    .line 27
    .line 28
    .line 29
    new-instance v1, Lav5;

    .line 30
    .line 31
    const-class v2, Lt30;

    .line 32
    .line 33
    const-class v3, Ljava/util/concurrent/ExecutorService;

    .line 34
    .line 35
    invoke-direct {v1, v2, v3}, Lav5;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 36
    .line 37
    .line 38
    new-instance v2, Lzp1;

    .line 39
    .line 40
    const/4 v3, 0x1

    .line 41
    const/4 v4, 0x0

    .line 42
    invoke-direct {v2, v1, v3, v4}, Lzp1;-><init>(Lav5;II)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v2}, Lfv0;->a(Lzp1;)V

    .line 46
    .line 47
    .line 48
    new-instance v1, Lav5;

    .line 49
    .line 50
    const-class v2, Lx90;

    .line 51
    .line 52
    const-class v5, Ljava/util/concurrent/Executor;

    .line 53
    .line 54
    invoke-direct {v1, v2, v5}, Lav5;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 55
    .line 56
    .line 57
    new-instance v2, Lzp1;

    .line 58
    .line 59
    invoke-direct {v2, v1, v3, v4}, Lzp1;-><init>(Lav5;II)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v2}, Lfv0;->a(Lzp1;)V

    .line 63
    .line 64
    .line 65
    new-instance v1, Lta1;

    .line 66
    .line 67
    const/16 v2, 0x1a

    .line 68
    .line 69
    invoke-direct {v1, v2}, Lta1;-><init>(I)V

    .line 70
    .line 71
    .line 72
    iput-object v1, p0, Lfv0;->g:Ljava/lang/Object;

    .line 73
    .line 74
    invoke-virtual {p0}, Lfv0;->b()Lgv0;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    new-instance v1, Lhz2;

    .line 79
    .line 80
    invoke-direct {v1, v4}, Lhz2;-><init>(I)V

    .line 81
    .line 82
    .line 83
    const-class v2, Lhz2;

    .line 84
    .line 85
    invoke-static {v2}, Lgv0;->b(Ljava/lang/Class;)Lfv0;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    iput v3, v2, Lfv0;->c:I

    .line 90
    .line 91
    new-instance v3, Lev0;

    .line 92
    .line 93
    invoke-direct {v3, v4, v1}, Lev0;-><init>(ILjava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    iput-object v3, v2, Lfv0;->g:Ljava/lang/Object;

    .line 97
    .line 98
    invoke-virtual {v2}, Lfv0;->b()Lgv0;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    const-string v2, "19.1.1"

    .line 103
    .line 104
    invoke-static {v0, v2}, Lgw8;->q(Ljava/lang/String;Ljava/lang/String;)Lgv0;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    filled-new-array {p0, v1, v0}, [Lgv0;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    return-object p0
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
