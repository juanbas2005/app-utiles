.class public final synthetic Lk71;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lgs2;


# instance fields
.field public final synthetic A:I

.field public final synthetic B:Z

.field public final synthetic C:Z

.field public final synthetic D:Lse7;

.field public final synthetic E:Lhf7;

.field public final synthetic F:Lm78;

.field public final synthetic G:Lml4;

.field public final synthetic H:Lml4;

.field public final synthetic I:Lml4;

.field public final synthetic J:Lml4;

.field public final synthetic K:Lyb0;

.field public final synthetic L:Lze7;

.field public final synthetic M:Z

.field public final synthetic N:Z

.field public final synthetic O:Lw98;

.field public final synthetic P:Lo81;

.field public final synthetic Q:Lvr2;

.field public final synthetic R:Lv35;

.field public final synthetic S:Ltp1;

.field public final synthetic w:Lfw0;

.field public final synthetic x:Ltg7;

.field public final synthetic y:Lu44;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Lfw0;Ltg7;Lu44;IIZZLse7;Lhf7;Lm78;Lml4;Lml4;Lml4;Lml4;Lyb0;Lze7;ZZLw98;Lo81;Lvr2;Lv35;Ltp1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk71;->w:Lfw0;

    iput-object p2, p0, Lk71;->x:Ltg7;

    iput-object p3, p0, Lk71;->y:Lu44;

    iput p4, p0, Lk71;->z:I

    iput p5, p0, Lk71;->A:I

    iput-boolean p6, p0, Lk71;->B:Z

    iput-boolean p7, p0, Lk71;->C:Z

    iput-object p8, p0, Lk71;->D:Lse7;

    iput-object p9, p0, Lk71;->E:Lhf7;

    iput-object p10, p0, Lk71;->F:Lm78;

    iput-object p11, p0, Lk71;->G:Lml4;

    iput-object p12, p0, Lk71;->H:Lml4;

    iput-object p13, p0, Lk71;->I:Lml4;

    iput-object p14, p0, Lk71;->J:Lml4;

    iput-object p15, p0, Lk71;->K:Lyb0;

    move-object/from16 p1, p16

    iput-object p1, p0, Lk71;->L:Lze7;

    move/from16 p1, p17

    iput-boolean p1, p0, Lk71;->M:Z

    move/from16 p1, p18

    iput-boolean p1, p0, Lk71;->N:Z

    move-object/from16 p1, p19

    iput-object p1, p0, Lk71;->O:Lw98;

    move-object/from16 p1, p20

    iput-object p1, p0, Lk71;->P:Lo81;

    move-object/from16 p1, p21

    iput-object p1, p0, Lk71;->Q:Lvr2;

    move-object/from16 p1, p22

    iput-object p1, p0, Lk71;->R:Lv35;

    move-object/from16 p1, p23

    iput-object p1, p0, Lk71;->S:Ltp1;

    return-void
.end method


# virtual methods
.method public final H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lyt2;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    and-int/lit8 v3, v2, 0x3

    .line 16
    .line 17
    const/4 v4, 0x2

    .line 18
    const/4 v5, 0x1

    .line 19
    if-eq v3, v4, :cond_0

    .line 20
    .line 21
    move v3, v5

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v3, 0x0

    .line 24
    :goto_0
    and-int/2addr v2, v5

    .line 25
    invoke-virtual {v1, v2, v3}, Lyt2;->V(IZ)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    new-instance v3, Lg71;

    .line 32
    .line 33
    iget-object v4, v0, Lk71;->x:Ltg7;

    .line 34
    .line 35
    iget-object v5, v0, Lk71;->y:Lu44;

    .line 36
    .line 37
    iget v6, v0, Lk71;->z:I

    .line 38
    .line 39
    iget v7, v0, Lk71;->A:I

    .line 40
    .line 41
    iget-boolean v8, v0, Lk71;->B:Z

    .line 42
    .line 43
    iget-boolean v9, v0, Lk71;->C:Z

    .line 44
    .line 45
    iget-object v10, v0, Lk71;->D:Lse7;

    .line 46
    .line 47
    iget-object v11, v0, Lk71;->E:Lhf7;

    .line 48
    .line 49
    iget-object v12, v0, Lk71;->F:Lm78;

    .line 50
    .line 51
    iget-object v13, v0, Lk71;->G:Lml4;

    .line 52
    .line 53
    iget-object v14, v0, Lk71;->H:Lml4;

    .line 54
    .line 55
    iget-object v15, v0, Lk71;->I:Lml4;

    .line 56
    .line 57
    iget-object v2, v0, Lk71;->J:Lml4;

    .line 58
    .line 59
    move-object/from16 v16, v2

    .line 60
    .line 61
    iget-object v2, v0, Lk71;->K:Lyb0;

    .line 62
    .line 63
    move-object/from16 v17, v2

    .line 64
    .line 65
    iget-object v2, v0, Lk71;->L:Lze7;

    .line 66
    .line 67
    move-object/from16 v18, v2

    .line 68
    .line 69
    iget-boolean v2, v0, Lk71;->M:Z

    .line 70
    .line 71
    move/from16 v19, v2

    .line 72
    .line 73
    iget-boolean v2, v0, Lk71;->N:Z

    .line 74
    .line 75
    move/from16 v20, v2

    .line 76
    .line 77
    iget-object v2, v0, Lk71;->O:Lw98;

    .line 78
    .line 79
    move-object/from16 v21, v2

    .line 80
    .line 81
    iget-object v2, v0, Lk71;->P:Lo81;

    .line 82
    .line 83
    move-object/from16 v22, v2

    .line 84
    .line 85
    iget-object v2, v0, Lk71;->Q:Lvr2;

    .line 86
    .line 87
    move-object/from16 v23, v2

    .line 88
    .line 89
    iget-object v2, v0, Lk71;->R:Lv35;

    .line 90
    .line 91
    move-object/from16 v24, v2

    .line 92
    .line 93
    iget-object v2, v0, Lk71;->S:Ltp1;

    .line 94
    .line 95
    move-object/from16 v25, v2

    .line 96
    .line 97
    invoke-direct/range {v3 .. v25}, Lg71;-><init>(Ltg7;Lu44;IIZZLse7;Lhf7;Lm78;Lml4;Lml4;Lml4;Lml4;Lyb0;Lze7;ZZLw98;Lo81;Lvr2;Lv35;Ltp1;)V

    .line 98
    .line 99
    .line 100
    const v2, -0x2a4ac0e

    .line 101
    .line 102
    .line 103
    invoke-static {v2, v3, v1}, Lsu0;->J(ILds2;Lyt2;)Lfw0;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    const/4 v3, 0x6

    .line 108
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    iget-object v0, v0, Lk71;->w:Lfw0;

    .line 113
    .line 114
    invoke-virtual {v0, v2, v1, v3}, Lfw0;->u(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_1
    invoke-virtual {v1}, Lyt2;->Y()V

    .line 119
    .line 120
    .line 121
    :goto_1
    sget-object v0, Lvs7;->a:Lvs7;

    .line 122
    .line 123
    return-object v0
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
