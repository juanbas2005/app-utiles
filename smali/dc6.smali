.class public final Ldc6;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public A:Ljava/lang/Float;

.field public B:Lpb6;

.field public C:Ljava/lang/Float;

.field public D:[Lpb6;

.field public E:Lpb6;

.field public F:Ljava/lang/Float;

.field public G:Lgb6;

.field public H:Ljava/util/ArrayList;

.field public I:Lpb6;

.field public J:Ljava/lang/Integer;

.field public K:Ljava/lang/Boolean;

.field public L:Lam6;

.field public M:Ljava/lang/String;

.field public N:Ljava/lang/String;

.field public O:Ljava/lang/String;

.field public P:Ljava/lang/Boolean;

.field public Q:Ljava/lang/Boolean;

.field public R:Lmc6;

.field public S:Ljava/lang/Float;

.field public T:Ljava/lang/String;

.field public U:Ljava/lang/String;

.field public V:Lmc6;

.field public W:Ljava/lang/Float;

.field public X:Lmc6;

.field public Y:Ljava/lang/Float;

.field public Z:I

.field public a0:I

.field public b0:I

.field public c0:I

.field public d0:I

.field public e0:I

.field public f0:I

.field public g0:I

.field public h0:I

.field public i0:I

.field public w:J

.field public x:Lmc6;

.field public y:Ljava/lang/Float;

.field public z:Lmc6;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, Ldc6;->w:J

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
.end method

.method public static a()Ldc6;
    .locals 8

    .line 1
    new-instance v0, Ldc6;

    .line 2
    .line 3
    invoke-direct {v0}, Ldc6;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide/16 v1, -0x1

    .line 7
    .line 8
    iput-wide v1, v0, Ldc6;->w:J

    .line 9
    .line 10
    sget-object v1, Lgb6;->x:Lgb6;

    .line 11
    .line 12
    iput-object v1, v0, Ldc6;->x:Lmc6;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    iput v2, v0, Ldc6;->Z:I

    .line 16
    .line 17
    const/high16 v3, 0x3f800000    # 1.0f

    .line 18
    .line 19
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    iput-object v4, v0, Ldc6;->y:Ljava/lang/Float;

    .line 24
    .line 25
    const/4 v5, 0x0

    .line 26
    iput-object v5, v0, Ldc6;->z:Lmc6;

    .line 27
    .line 28
    iput-object v4, v0, Ldc6;->A:Ljava/lang/Float;

    .line 29
    .line 30
    new-instance v6, Lpb6;

    .line 31
    .line 32
    invoke-direct {v6, v3}, Lpb6;-><init>(F)V

    .line 33
    .line 34
    .line 35
    iput-object v6, v0, Ldc6;->B:Lpb6;

    .line 36
    .line 37
    iput v2, v0, Ldc6;->a0:I

    .line 38
    .line 39
    iput v2, v0, Ldc6;->b0:I

    .line 40
    .line 41
    const/high16 v3, 0x40800000    # 4.0f

    .line 42
    .line 43
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    iput-object v3, v0, Ldc6;->C:Ljava/lang/Float;

    .line 48
    .line 49
    iput-object v5, v0, Ldc6;->D:[Lpb6;

    .line 50
    .line 51
    new-instance v3, Lpb6;

    .line 52
    .line 53
    const/4 v6, 0x0

    .line 54
    invoke-direct {v3, v6}, Lpb6;-><init>(F)V

    .line 55
    .line 56
    .line 57
    iput-object v3, v0, Ldc6;->E:Lpb6;

    .line 58
    .line 59
    iput-object v4, v0, Ldc6;->F:Ljava/lang/Float;

    .line 60
    .line 61
    iput-object v1, v0, Ldc6;->G:Lgb6;

    .line 62
    .line 63
    iput-object v5, v0, Ldc6;->H:Ljava/util/ArrayList;

    .line 64
    .line 65
    new-instance v3, Lpb6;

    .line 66
    .line 67
    const/high16 v6, 0x41400000    # 12.0f

    .line 68
    .line 69
    const/4 v7, 0x7

    .line 70
    invoke-direct {v3, v7, v6}, Lpb6;-><init>(IF)V

    .line 71
    .line 72
    .line 73
    iput-object v3, v0, Ldc6;->I:Lpb6;

    .line 74
    .line 75
    const/16 v3, 0x190

    .line 76
    .line 77
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    iput-object v3, v0, Ldc6;->J:Ljava/lang/Integer;

    .line 82
    .line 83
    iput v2, v0, Ldc6;->c0:I

    .line 84
    .line 85
    iput v2, v0, Ldc6;->d0:I

    .line 86
    .line 87
    iput v2, v0, Ldc6;->e0:I

    .line 88
    .line 89
    iput v2, v0, Ldc6;->f0:I

    .line 90
    .line 91
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 92
    .line 93
    iput-object v3, v0, Ldc6;->K:Ljava/lang/Boolean;

    .line 94
    .line 95
    iput-object v5, v0, Ldc6;->L:Lam6;

    .line 96
    .line 97
    iput-object v5, v0, Ldc6;->M:Ljava/lang/String;

    .line 98
    .line 99
    iput-object v5, v0, Ldc6;->N:Ljava/lang/String;

    .line 100
    .line 101
    iput-object v5, v0, Ldc6;->O:Ljava/lang/String;

    .line 102
    .line 103
    iput-object v3, v0, Ldc6;->P:Ljava/lang/Boolean;

    .line 104
    .line 105
    iput-object v3, v0, Ldc6;->Q:Ljava/lang/Boolean;

    .line 106
    .line 107
    iput-object v1, v0, Ldc6;->R:Lmc6;

    .line 108
    .line 109
    iput-object v4, v0, Ldc6;->S:Ljava/lang/Float;

    .line 110
    .line 111
    iput-object v5, v0, Ldc6;->T:Ljava/lang/String;

    .line 112
    .line 113
    iput v2, v0, Ldc6;->g0:I

    .line 114
    .line 115
    iput-object v5, v0, Ldc6;->U:Ljava/lang/String;

    .line 116
    .line 117
    iput-object v5, v0, Ldc6;->V:Lmc6;

    .line 118
    .line 119
    iput-object v4, v0, Ldc6;->W:Ljava/lang/Float;

    .line 120
    .line 121
    iput-object v5, v0, Ldc6;->X:Lmc6;

    .line 122
    .line 123
    iput-object v4, v0, Ldc6;->Y:Ljava/lang/Float;

    .line 124
    .line 125
    iput v2, v0, Ldc6;->h0:I

    .line 126
    .line 127
    iput v2, v0, Ldc6;->i0:I

    .line 128
    .line 129
    return-object v0
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
.method public final clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ldc6;

    .line 6
    .line 7
    iget-object p0, p0, Ldc6;->D:[Lpb6;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, [Lpb6;->clone()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, [Lpb6;

    .line 16
    .line 17
    iput-object p0, v0, Ldc6;->D:[Lpb6;

    .line 18
    .line 19
    :cond_0
    return-object v0
    .line 20
    .line 21
.end method
